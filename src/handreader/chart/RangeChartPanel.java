import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * panel to show a whole deck of cards
 */
public class RangeChartPanel extends JPanel {

	public static final String CARD_SEL_PROP_CHANGE = "cardsel", CARD_DESEL_PROP_CHANGE = "carddesel";
	private final List<RangeButton> rangeButtons = new ArrayList<>();

	/** complete chart in face then suit order, lowest first */
	private static final String[] chartArr = {
			"2h", "2s", "2c", "2d", "2h", "2s", "2c", "2d", "2h", "2s", "2c", "2d", "2h",
			"3h", "3s", "3c", "3d", "2h", "2s", "2c", "2d", "2h", "2s", "2c", "2d", "2h",
			"4h", "4s", "4c", "4d", "2h", "2s", "2c", "2d", "2h", "2s", "2c", "2d", "2h",
			"5h", "5s", "5c", "5d", "2h", "2s", "2c", "2d", "2h", "2s", "2c", "2d", "2h",
			"6h", "6s", "6c", "6d", "2h", "2s", "2c", "2d", "2h", "2s", "2c", "2d", "2h",
			"7h", "7s", "7c", "7d", "2h", "2s", "2c", "2d", "2h", "2s", "2c", "2d", "2h",
			"8h", "8s", "8c", "8d", "2h", "2s", "2c", "2d", "2h", "2s", "2c", "2d", "2h",
			"9h", "9s", "9c", "9d", "2h", "2s", "2c", "2d", "2h", "2s", "2c", "2d", "2h",
			"Th", "Ts", "Tc", "Td", "2h", "2s", "2c", "2d", "2h", "2s", "2c", "2d", "2h",
			"Jh", "Js", "Jc", "Jd", "2h", "2s", "2c", "2d", "2h", "2s", "2c", "2d", "2h",
			"Qh", "Qs", "Qc", "Qd", "2h", "2s", "2c", "2d", "2h", "2s", "2c", "2d", "2h",
			"Kh", "Ks", "Kc", "Kd", "2h", "2s", "2c", "2d", "2h", "2s", "2c", "2d", "2h",
			"Ah", "As", "Ac", "Ad", "2h", "2s", "2c", "2d", "2h", "2s", "2c", "2d", "2h",
	};

	public RangeChartPanel() {
		super(new GridLayout(13, 13));
		setBorder(BorderFactory.createTitledBorder("Chart"));

		final List<String> chart = Collections.unmodifiableList(Arrays.asList(chartArr));
		List<String> chartValues = new ArrayList<>(chart);
		Collections.reverse(chartValues);
		for (String c : chartValues) {
				final RangeButton b = new RangeButton();
					b.setName("Deck-" + c);
					//b.setCard(c);
					b.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							if (b.isSelected()) {
								System.out.println("chartValues panel card selected: " + b.getName());
								firePropertyChange(CARD_SEL_PROP_CHANGE, "x", b.getCard());
							} else {
								System.out.println("chartValues panel card deselected: " + b.getName());
								firePropertyChange(CARD_DESEL_PROP_CHANGE, "x", b.getCard());
							}
						}
					});
					add(b);
					rangeButtons.add(b);
			}
	}

	/** call setCardHidden on all the card buttons */
	public void setCardsHidden(boolean hide) {
		for (RangeButton b : rangeButtons) {
			b.setCardHidden(hide);
		}
	}
	
	/** select the given card, return true if the card was selected or is already selected */
	public boolean setCardSelected(String card, boolean selected) {
		for (RangeButton b : rangeButtons) {
			if (b.getCard().equals(card)) {
				b.setSelected(selected);
				return true;
			}
		}
		return false;
	}
	
	/**
	 * get the cards by selection status.
	 * always returns a new list
	 */
	public List<String> getCards(boolean selected) {
		List<String> cards = new ArrayList<>();
		for (RangeButton b : rangeButtons) {
			if (b.isSelected() == selected) {
				cards.add(b.getCard());
			}
		}
		return cards;
	}

	/**
	 * deselect all cards
	 */
	public void deselectCards() {
		for (RangeButton b : rangeButtons) {
			if (b.isSelected()) {
				b.setSelected(false);
			}
		}
	}
	
}
