package handreader;

import handreader.chart.*;
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
			"AA", "AKs", "AQs", "AJs", "ATs", "A9s", "A8s", "A7s", "A6s", "A5s", "A4s", "A3s", "A2s",
			"AKo", "KK", "KQs", "KJs", "KTs", "K9s", "K8s", "K7s", "K6s", "K5s", "K4s", "K3s", "K2s",
			"AQo", "KQo", "QQ", "QJs", "QTs", "Q9s", "Q8s", "Q7s", "Q6s", "Q5s", "Q4s", "Q3s", "Q2s",
			"AJo", "KJo", "QJo", "JJ", "JTs", "J9s", "J8s", "J7s", "J6s", "J5s", "J4s", "J3s", "J2s",
			"ATo", "KTo", "QTo", "JTo", "TT", "T9s", "T8s", "T7s", "T6s", "T5s", "T4s", "T3s", "T2s",
			"A9o", "K9o", "Q9o", "J9o", "T9o", "99", "98s", "97s", "96s", "95s", "94s", "93s", "92s",
			"A8o", "K8o", "Q8o", "J8o", "T8o", "98o", "88", "87s", "86s", "85s", "84s", "83s", "82s",
			"A7o", "K7o", "Q7o", "J7o", "T7o", "97o", "87o", "77", "76s", "75s", "74s", "73s", "72s",
			"A6o", "K6o", "Q6o", "J6o", "T6o", "96o", "86o", "76o", "66", "65s", "64s", "63s", "62s",
			"A5o", "K5o", "Q5o", "J5o", "T5o", "95o", "85o", "75o", "65o", "55", "54s", "53s", "52s",
			"A4o", "K4o", "Q4o", "J4o", "T4o", "94o", "84o", "74o", "64o", "54o", "44", "43s", "42s",
			"A3o", "K3o", "Q3o", "J3o", "T3o", "93o", "83o", "73o", "63o", "53o", "43o", "33", "32s",
			"A2o", "K2o", "Q2o", "J2o", "T2o", "92o", "82o", "72o", "62o", "52o", "42o", "32o", "22",
	};

	public RangeChartPanel() {
		super(new GridLayout(13, 13));
		setBorder(BorderFactory.createTitledBorder("Chart"));

		final List<String> chart = Collections.unmodifiableList(Arrays.asList(chartArr));
		List<String> chartValues = new ArrayList<>(chart);
		//Collections.reverse(chartValues);
		for (String c : chartValues) {
				final RangeButton b = new RangeButton();
					b.setName("Deck-" + c);
					b.setCard(c);
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

    public List<handreader.RangeButton> getRangeButtons() {
        return rangeButtons;
    }
    
    public void updateButtons() {
        for (RangeButton b : rangeButtons) {
            b.update();
	}
    }
}
