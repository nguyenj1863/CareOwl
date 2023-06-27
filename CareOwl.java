import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.applet.*;
import java.applet.Applet;
import java.net.URI;

public class CareOwl extends Applet implements ActionListener
{
    Panel p_card; //to hold all of the screens
    Panel card1, card2, card3, card4, card5, card6, card7, card8, card9, card10, card11, card12, card13, card14; //the screens
    CardLayout cdLayout = new CardLayout ();

    AudioClip soundFile1; //Ocean
    AudioClip soundFile2; //Forest
    AudioClip soundFile3; //Rain
    AudioClip soundFile4; //Fire

    JButton heart;
    JButton stop;
    JLabel cover;
    JLabel songtitle;
    int h[] = {0, 0, 0, 0};
    int play = 0;
    int song = 0;

    public void init ()
    {
	p_card = new Panel ();
	p_card.setLayout (cdLayout);
	screen1 ();
	screen2 ();
	screen3 ();
	screen4 ();
	screen5 ();
	screen6 ();
	screen7 ();
	screen8 ();
	screen9 ();
	screen10 ();
	screen11 ();
	screen12 ();
	screen13 ();
	screen14 ();
	resize (375, 812);
	setLayout (new BorderLayout ());
	add ("Center", p_card);
	soundFile1 = getAudioClip (getDocumentBase (), "Ocean.wav");
	soundFile2 = getAudioClip (getDocumentBase (), "Forest.wav");
	soundFile3 = getAudioClip (getDocumentBase (), "Rain.wav");
	soundFile4 = getAudioClip (getDocumentBase (), "Fire.wav");
    }




    public void screen1 ()
    { //Home Page
	card1 = new Panel ();
	card1.setBackground (new Color (252, 247, 243));
	//Button Image
	JButton next = new JButton (createImageIcon ("homepage.jpg"));
	next.setBorder (null);
	next.setActionCommand ("s2");
	next.addActionListener (this);
	//Card Elements
	card1.add (next);
	p_card.add ("1", card1);
    }


    public void screen2 ()
    { //Terms & Conditions
	card2 = new Panel ();
	card2.setBackground (new Color (252, 247, 243));
	//Button Image
	JButton next = new JButton (createImageIcon ("S2.jpg"));
	next.setBorder (null);
	next.setActionCommand ("s14");
	next.addActionListener (this);
	//Card Elements
	card2.add (next);
	p_card.add ("2", card2);
    }


    public void screen3 ()
    { //Home Screen
	card3 = new Panel ();
	card3.setBackground (new Color (252, 247, 243));
	//Heading
	JLabel owl = new JLabel (createImageIcon ("S3Title.jpg"));
	//Options
	Panel options = new Panel (new GridLayout (10, 30, 10, 30));
	//Professional
	JButton Op1 = new JButton ("Get in Touch with a Mental Health Professional");
	Op1.setFont (new Font ("Baloo Da", Font.BOLD, 12));
	Op1.setBackground (new Color (60, 69, 98));
	Op1.setForeground (new Color (252, 247, 243));
	Op1.setPreferredSize (new Dimension (332, 50));
	Op1.setBorder (null);
	Op1.setActionCommand ("s7");
	Op1.addActionListener (this);
	//Personalized
	JButton Op2 = new JButton ("Personalized Mental Health Care");
	Op2.setFont (new Font ("Baloo Da", Font.BOLD, 12));
	Op2.setBackground (new Color (60, 69, 98));
	Op2.setForeground (new Color (252, 247, 243));
	Op2.setBorder (null);
	Op2.setActionCommand ("s4");
	Op2.addActionListener (this);
	//Language
	JButton Op3 = new JButton ("Consciousness & Language");
	Op3.setFont (new Font ("Baloo Da", Font.BOLD, 12));
	Op3.setBackground (new Color (60, 69, 98));
	Op3.setForeground (new Color (252, 247, 243));
	Op3.setBorder (null);
	Op3.setActionCommand ("s5");
	Op3.addActionListener (this);
	//Support
	JButton Op4 = new JButton ("Wellness Information & Support");
	Op4.setFont (new Font ("Baloo Da", Font.BOLD, 12));
	Op4.setBackground (new Color (60, 69, 98));
	Op4.setForeground (new Color (252, 247, 243));
	Op4.setBorder (null);
	Op4.setActionCommand ("s6");
	Op4.addActionListener (this);
	//Card Elements
	card3.add (owl);
	options.add (Op1);
	options.add (Op2);
	options.add (Op3);
	options.add (Op4);
	card3.add (options);
	p_card.add ("3", card3);
    }


    public void screen4 ()
    { //Personalized Mental Health Care
	card4 = new Panel ();
	card4.setBackground (new Color (252, 247, 243));
	JLabel top = new JLabel (createImageIcon ("S5Top.jpg"));
	JButton Op1 = new JButton ("Tips & Tricks to Relieve Episodes");
	Op1.setFont (new Font ("Baloo Da", Font.BOLD, 17));
	Op1.setBackground (new Color (60, 69, 98));
	Op1.setForeground (new Color (252, 247, 243));
	Op1.setPreferredSize (new Dimension (332, 50));
	Op1.setActionCommand ("s10");
	Op1.addActionListener (this);
	Op1.setBorder (null);
	JLabel mid1 = new JLabel (createImageIcon ("S5mid1.jpg"));
	JButton Op2 = new JButton ("Stir Your Soul & Calm Your Nerves");
	Op2.setFont (new Font ("Baloo Da", Font.BOLD, 17));
	Op2.setBackground (new Color (60, 69, 98));
	Op2.setForeground (new Color (252, 247, 243));
	Op2.setPreferredSize (new Dimension (332, 50));
	Op2.setActionCommand ("s12");
	Op2.addActionListener (this);
	Op2.setBorder (null);
	JLabel mid2 = new JLabel (createImageIcon ("S5mid2.jpg"));
	JButton Op3 = new JButton ("Gratitude Journal");
	Op3.setFont (new Font ("Baloo Da", Font.BOLD, 17));
	Op3.setBackground (new Color (60, 69, 98));
	Op3.setForeground (new Color (252, 247, 243));
	Op3.setPreferredSize (new Dimension (332, 50));
	Op3.setActionCommand ("s13");
	Op3.addActionListener (this);
	Op3.setBorder (null);
	JLabel bot = new JLabel (createImageIcon ("S5Bot.jpg"));
	//Back to screen3
	JButton back = new JButton ("Back");
	back.setFont (new Font ("Baloo Da", Font.BOLD, 23));
	back.setBackground (new Color (60, 69, 98));
	back.setForeground (new Color (252, 247, 243));
	back.setPreferredSize (new Dimension (117, 40));
	back.setBorder (null);
	back.setActionCommand ("s3");
	back.addActionListener (this);
	//Card Elements
	card4.add (top);
	card4.add (Op1);
	card4.add (mid1);
	card4.add (Op2);
	card4.add (mid2);
	card4.add (Op3);
	card4.add (bot);
	card4.add (back);
	p_card.add ("4", card4);
    }


    public void screen5 ()
    { //Consciousness & Language
	card5 = new Panel ();
	card5.setBackground (new Color (252, 247, 243));
	JLabel title = new JLabel (createImageIcon ("S6.jpg"));
	//Back to screen3
	JButton back = new JButton ("Back");
	back.setFont (new Font ("Baloo Da", Font.BOLD, 23));
	back.setBackground (new Color (60, 69, 98));
	back.setForeground (new Color (252, 247, 243));
	back.setPreferredSize (new Dimension (117, 40));
	back.setBorder (null);
	back.setActionCommand ("s3");
	back.addActionListener (this);
	//Card Elements
	card5.add (title);
	card5.add (back);
	p_card.add ("5", card5);
    }


    public void screen6 ()
    { //Wellness Information & Support
	card6 = new Panel ();
	card6.setBackground (new Color (252, 247, 243));
	JLabel title = new JLabel (createImageIcon ("S7.jpg"));
	//Back to screen3
	JButton back = new JButton ("Back");
	back.setFont (new Font ("Baloo Da", Font.BOLD, 23));
	back.setBackground (new Color (60, 69, 98));
	back.setForeground (new Color (252, 247, 243));
	back.setPreferredSize (new Dimension (117, 40));
	back.setBorder (null);
	back.setActionCommand ("s3");
	back.addActionListener (this);
	//Card Elements
	card6.add (title);
	card6.add (back);
	p_card.add ("6", card6);
    }



    public void screen7 ()
    { //Get in Touch with a Mental Health Professional
	card7 = new Panel ();
	card7.setBackground (new Color (252, 247, 243));
	JLabel top = new JLabel (createImageIcon ("S4Top.jpg"));
	JButton Op1 = new JButton ("Crisis Numbers");
	Op1.setFont (new Font ("Baloo Da", Font.BOLD, 30));
	Op1.setBackground (new Color (60, 69, 98));
	Op1.setForeground (new Color (252, 247, 243));
	Op1.setPreferredSize (new Dimension (267, 66));
	Op1.setActionCommand ("s8");
	Op1.addActionListener (this);
	Op1.setBorder (null);
	JLabel mid = new JLabel (createImageIcon ("S4Mid.jpg"));
	JButton Op2 = new JButton ("Video Chat");
	Op2.setFont (new Font ("Baloo Da", Font.BOLD, 30));
	Op2.setBackground (new Color (60, 69, 98));
	Op2.setForeground (new Color (252, 247, 243));
	Op2.setPreferredSize (new Dimension (267, 66));
	Op2.setActionCommand ("s9");
	Op2.addActionListener (this);
	Op2.setBorder (null);
	JLabel bot = new JLabel (createImageIcon ("S4Bot.jpg"));
	//Back to screen3
	JButton back = new JButton ("Back");
	back.setFont (new Font ("Baloo Da", Font.BOLD, 23));
	back.setBackground (new Color (60, 69, 98));
	back.setForeground (new Color (252, 247, 243));
	back.setPreferredSize (new Dimension (117, 40));
	back.setBorder (null);
	back.setActionCommand ("s3");
	back.addActionListener (this);
	//Card Elements
	card7.add (top);
	card7.add (Op1);
	card7.add (mid);
	card7.add (Op2);
	card7.add (bot);
	card7.add (back);
	p_card.add ("7", card7);
    }


    public void screen8 ()
    { //Crisis Hotlines
	card8 = new Panel ();
	card8.setBackground (new Color (252, 247, 243));
	JLabel title = new JLabel (createImageIcon ("S8.jpg"));
	//Back to screen3
	JButton back = new JButton ("Back");
	back.setFont (new Font ("Baloo Da", Font.BOLD, 23));
	back.setBackground (new Color (60, 69, 98));
	back.setForeground (new Color (252, 247, 243));
	back.setPreferredSize (new Dimension (117, 40));
	back.setBorder (null);
	back.setActionCommand ("s7");
	back.addActionListener (this);
	//Card Elements
	card8.add (title);
	card8.add (back);
	p_card.add ("8", card8);
    }


    public void screen9 ()
    { //Video Chat
	card9 = new Panel ();
	card9.setBackground (new Color (252, 247, 243));
	JLabel title = new JLabel (createImageIcon ("S9.jpg"));
	//Back to screen3
	JButton back = new JButton (createImageIcon ("S9Back.jpg"));
	back.setBorder (null);
	back.setActionCommand ("s7");
	back.addActionListener (this);
	//Card Elements
	card9.add (title);
	card9.add (back);
	p_card.add ("9", card9);
    }


    public void screen10 ()
    { //How to De-stress, Relax & Promote Positivity
	card10 = new Panel ();
	card10.setBackground (new Color (252, 247, 243));
	JLabel title = new JLabel (createImageIcon ("S10.jpg"));
	//Back to screen3
	JButton next = new JButton ("Next");
	next.setFont (new Font ("Baloo Da", Font.BOLD, 23));
	next.setBackground (new Color (60, 69, 98));
	next.setForeground (new Color (252, 247, 243));
	next.setPreferredSize (new Dimension (117, 40));
	next.setBorder (null);
	next.setActionCommand ("s11");
	next.addActionListener (this);
	//Card Elements
	card10.add (title);
	card10.add (next);
	p_card.add ("10", card10);
    }


    public void screen11 ()
    { //Tips & Tricks to Relieve Episodes
	card11 = new Panel ();
	card11.setBackground (new Color (252, 247, 243));
	JLabel title = new JLabel (createImageIcon ("S11.jpg"));
	//Back to screen3
	JButton back = new JButton ("Back");
	back.setFont (new Font ("Baloo Da", Font.BOLD, 23));
	back.setBackground (new Color (60, 69, 98));
	back.setForeground (new Color (252, 247, 243));
	back.setPreferredSize (new Dimension (117, 40));
	back.setBorder (null);
	back.setActionCommand ("s4");
	back.addActionListener (this);
	//Card Elements
	card11.add (title);
	card11.add (back);
	p_card.add ("11", card11);
    }


    public void screen12 ()
    { //Stir Your Soul & Calm Your Nerves
	card12 = new Panel ();
	card12.setBackground (new Color (252, 247, 243));
	coverstart ();
	JLabel top = new JLabel (createImageIcon ("S12Top.jpg"));
	JLabel mid1 = new JLabel (createImageIcon ("S12Mid1.jpg"));
	//Song Title
	titlestart ();
	songtitle.setFont (new Font ("Baloo Da", Font.BOLD, 23));
	JLabel mid2 = new JLabel (createImageIcon ("S12Mid2.jpg"));
	//Control Buttons
	Panel control = new Panel ();
	//Heart
	heartstart ();
	JButton previous = new JButton (createImageIcon ("S12Previous.jpg"));
	previous.setBorder (null);
	previous.setActionCommand ("previous");
	previous.addActionListener (this);
	playstart ();
	JButton next = new JButton (createImageIcon ("S12Next.jpg"));
	next.setBorder (null);
	next.setActionCommand ("next");
	next.addActionListener (this);
	JButton spare = new JButton (createImageIcon ("S12Spare.jpg"));
	spare.setBorder (null);
	JLabel bot = new JLabel (createImageIcon ("S12Bot.jpg"));
	//Back to screen3
	JButton back = new JButton ("Back");
	back.setFont (new Font ("Baloo Da", Font.BOLD, 23));
	back.setBackground (new Color (60, 69, 98));
	back.setForeground (new Color (252, 247, 243));
	back.setPreferredSize (new Dimension (117, 40));
	back.setBorder (null);
	back.setActionCommand ("s4");
	back.addActionListener (this);
	//Card Elements
	control.add (heart);
	control.add (previous);
	control.add (stop);
	control.add (next);
	control.add (spare);
	card12.add (top);
	card12.add (cover);
	card12.add (mid1);
	card12.add (songtitle);
	card12.add (mid2);
	card12.add (control);
	card12.add (bot);
	card12.add (back);
	p_card.add ("12", card12);

    }


    public void screen13 ()
    { //Gratitude Journal
	card13 = new Panel ();
	card13.setBackground (new Color (252, 247, 243));
	JLabel top = new JLabel (createImageIcon ("S13Top.jpg"));
	JTextArea entry = new JTextArea (17, 30);
	JLabel bot = new JLabel (createImageIcon ("S13Bot.jpg"));
	//Back to screen3
	JButton back = new JButton ("Back");
	back.setFont (new Font ("Baloo Da", Font.BOLD, 23));
	back.setBackground (new Color (60, 69, 98));
	back.setForeground (new Color (252, 247, 243));
	back.setPreferredSize (new Dimension (117, 40));
	back.setBorder (null);
	back.setActionCommand ("s4");
	back.addActionListener (this);
	//Card Elements
	card13.add (top);
	card13.add (entry);
	card13.add (bot);
	card13.add (back);
	p_card.add ("13", card13);
    }


    public void screen14 ()
    { //Message from the Creators
	card14 = new Panel ();
	card14.setBackground (new Color (252, 247, 243));
	//Button Image
	JButton next = new JButton (createImageIcon ("S14.jpg"));
	next.setBorder (null);
	next.setActionCommand ("s3");
	next.addActionListener (this);
	//Card Elements
	card14.add (next);
	p_card.add ("14", card14);
    }


    public void titlestart ()
    {
	if (song == 0)
	    songtitle = new JLabel ("Ocean");
	else if (song == 1)
	    songtitle = new JLabel ("Forest");
	else if (song == 2)
	    songtitle = new JLabel ("Rain");
	else if (song == 3)
	    songtitle = new JLabel ("Fireplace");
    }


    public void coverstart ()
    {
	if (song == 0)
	    cover = new JLabel (createImageIcon ("S12Ocean.jpg"));
	else if (song == 1)
	    cover = new JLabel (createImageIcon ("S12Forest.jpg"));
	else if (song == 2)
	    cover = new JLabel (createImageIcon ("S12Rain.jpg"));
	else if (song == 3)
	    cover = new JLabel (createImageIcon ("S12Fire.jpg"));
    }


    public void heartstart ()
    {
	if (h [song] == 0)
	    heart = new JButton (createImageIcon ("S12Heart1.jpg"));
	else
	    heart = new JButton (createImageIcon ("S12Heart2.jpg"));
	heart.setBorder (null);
	heart.setActionCommand ("heart");
	heart.addActionListener (this);
    }


    public void playstart ()
    {
	if (play == 0)
	    stop = new JButton (createImageIcon ("S12Play.jpg"));
	else
	    stop = new JButton (createImageIcon ("S12Stop.jpg"));
	stop.setBorder (null);
	stop.setActionCommand ("plot");
	stop.addActionListener (this);
    }


    public void like ()
    { //Resets Like
	if (h [song] == 0)
	    heart.setIcon (new ImageIcon ("S12Heart1.jpg"));
	else
	    heart.setIcon (new ImageIcon ("S12Heart2.jpg"));
    }


    public void titlereset ()
    { //Resets title
	if (song == 0)
	    songtitle.setText ("Ocean");
	else if (song == 1)
	    songtitle.setText ("Forest");
	else if (song == 2)
	    songtitle.setText ("Rain");
	else if (song == 3)
	    songtitle.setText ("Fire");
    }


    public void songlike ()
    { //Alternates Like
	if (h [song] == 0)
	{
	    h [song]++;
	    heart.setIcon (new ImageIcon ("S12Heart2.jpg"));
	}
	else
	{
	    h [song] = 0;
	    heart.setIcon (new ImageIcon ("S12Heart1.jpg"));
	}
    }


    public void plot ()
    { //Alternates Play Button
	if (play == 0)
	{
	    play++;
	    stop.setIcon (new ImageIcon ("S12Stop.jpg"));
	    mixerplay ();
	}
	else
	{
	    play = 0;
	    stop.setIcon (new ImageIcon ("S12Play.jpg"));
	    mixerstop ();
	}
    }


    public void mixerplay ()
    {

	if (song == 0)
	    soundFile1.play ();
	else if (song == 1)
	    soundFile2.play ();
	else if (song == 2)
	    soundFile3.play ();

	else if (song == 3)

	    soundFile4.play ();
    }


    public void mixerstop ()
    {
	soundFile1.stop ();
	soundFile2.stop ();
	soundFile3.stop ();
	soundFile4.stop ();
    }


    public void picture ()
    { //Resets Cover
	if (song == 0)
	    cover.setIcon (new ImageIcon ("S12Ocean.jpg"));
	else if (song == 1)
	    cover.setIcon (new ImageIcon ("S12Forest.jpg"));
	else if (song == 2)
	    cover.setIcon (new ImageIcon ("S12Rain.jpg"));
	else if (song == 3)
	    cover.setIcon (new ImageIcon ("S12Fire.jpg"));
    }


    public void reset ()
    {
	picture ();
	like ();
	titlereset ();
	stop.setIcon (new ImageIcon ("S12Play.jpg"));
	play = 0;
	mixerstop ();
    }


    public void left ()
    { //Changes to Last Song
	if (song == 0)
	{

	    song = 3;
	    reset ();

	}
	else if (song == 1)
	{
	    song--;
	    reset ();
	}
	else if (song == 2)
	{
	    song--;
	    reset ();
	}
	else if (song == 3)
	{
	    song--;
	    reset ();
	}
    }


    public void right ()
    { //Changes to Next Song
	if (song == 0)
	{
	    song++;
	    reset ();
	}
	else if (song == 1)
	{
	    song++;
	    reset ();
	}
	else if (song == 2)
	{
	    song++;
	    reset ();
	}
	else if (song == 3)
	{
	    song = 0;
	    reset ();
	}
    }


    public void actionPerformed (ActionEvent e)
    {
	//switch screens
	if (e.getActionCommand ().equals ("s1"))
	    cdLayout.show (p_card, "1");
	else if (e.getActionCommand ().equals ("s2"))
	    cdLayout.show (p_card, "2");
	else if (e.getActionCommand ().equals ("s3"))
	    cdLayout.show (p_card, "3");
	else if (e.getActionCommand ().equals ("s4"))
	    cdLayout.show (p_card, "4");
	else if (e.getActionCommand ().equals ("s5"))
	    cdLayout.show (p_card, "5");
	else if (e.getActionCommand ().equals ("s6"))
	    cdLayout.show (p_card, "6");
	else if (e.getActionCommand ().equals ("s7"))
	    cdLayout.show (p_card, "7");
	else if (e.getActionCommand ().equals ("s8"))
	    cdLayout.show (p_card, "8");
	else if (e.getActionCommand ().equals ("s9"))
	    cdLayout.show (p_card, "9");
	else if (e.getActionCommand ().equals ("s10"))
	    cdLayout.show (p_card, "10");
	else if (e.getActionCommand ().equals ("s11"))
	    cdLayout.show (p_card, "11");
	else if (e.getActionCommand ().equals ("s12"))
	    cdLayout.show (p_card, "12");
	else if (e.getActionCommand ().equals ("s13"))
	    cdLayout.show (p_card, "13");
	else if (e.getActionCommand ().equals ("s14"))
	    cdLayout.show (p_card, "14");
	else if (e.getActionCommand ().equals ("heart"))
	    songlike ();
	else if (e.getActionCommand ().equals ("plot"))
	    plot ();
	else if (e.getActionCommand ().equals ("previous"))
	    left ();
	else if (e.getActionCommand ().equals ("next"))
	    right ();
    }


    protected static ImageIcon createImageIcon (String path)
    {
	java.net.URL imgURL = CareOwl.class.getResource (path);
	if (imgURL != null)
	{
	    return new ImageIcon (imgURL);
	}
	else
	{
	    System.err.println ("Couldn't find file: " + path);
	    return null;
	}
    }
}


