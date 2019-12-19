package handreader;


import handreader.chart.*;
import java.awt.*;
import javax.swing.*;

/**
 * toggle button to show blank or specific card.
 */
class RangeButton extends JToggleButton {

    public static final Font cardfont = new Font("SansSerif", Font.PLAIN, 12);

    private String card;
    private boolean hidden;

    /**
     * create a blank card button
     */
    public RangeButton() {
        super("  ");
        setFont(cardfont);
        setPreferredSize(new Dimension(54, 54));
        setMinimumSize(getPreferredSize());
        setBackground(Color.white);
    }

    @Override
    public Insets getInsets() {
        // override the crazy default insets that make it impossible to show big
        // text in a small button
        return new Insets(2, 2, 2, 2);
    }

    @Override
    public Insets getInsets(Insets insets) {
        return getInsets();
    }

    public void setCard(String card) {
        System.out.println("card button " + getName() + " set card " + card);
        this.card = card;
        update();
    }

    public String getCard() {
        return card;
    }

    public void setCardHidden(boolean hidden) {
        this.hidden = hidden;
        update();
    }

    public boolean isHidden() {
        return hidden;
    }

    private void update() {
        if (card != null) {
            if (hidden) {
                setForeground(Color.black);
                setText("--");
            } else {
                setForeground(Color.black);
                if (getCard().length() == 2) {
                    setBackground(Color.blue);
                    setForeground(Color.white);
                } else if (getCard().contains("o")) {
                    setBackground(Color.red);
                    setForeground(Color.white);
                } else {
                    setBackground(Color.yellow);
                }
                // doesn't fit
                //setText(f == 'T' ? "10" + s : "" + f + s);
                setText("" + getCard());
            }
        } else {
            setText("  ");
        }
    }

}
