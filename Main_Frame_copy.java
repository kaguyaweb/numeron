import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Font;
import java.util.Random;

public class Main_Frame_copy extends JFrame {
    public static void main(String args[]) {
        new Main_Frame_copy();
    }

    private JPanel cardPanel;
    private static final String TITLE_PANEL = "title";  //タイトル画面
    private static final String SELECT_PANEL = "select";  //難易度選択画面
    /*   private static final String EASY_PANEL = "easy";
     private static final String NORMAL_PANEL = "normal";
     private static final String HARD_PANEL = "hard";*/

    public Main_Frame_copy() {
        setTitle("---NUMERON---");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(1280, 720);
        setLocationRelativeTo(null);

        //複数のパネルを乗せ, 名前で切り替える土台となるパネル

        cardPanel = new JPanel();
        cardPanel.setLayout(new CardLayout()); //CardLayoutは重なったパネルを切り替えることができる


	
        //1枚目
        JPanel titlePanel = createTitlePanel();
        cardPanel.add(titlePanel, TITLE_PANEL);

        //2枚目
        JPanel selectPanel = createSelectPanel();
        cardPanel.add(selectPanel, SELECT_PANEL);

	//３枚目
	//	JPanel easyPanel = 

        //起動時は一枚目を表示
        ((CardLayout)(cardPanel.getLayout())).show(cardPanel, TITLE_PANEL);

        getContentPane().add(cardPanel);
        setVisible(true);
    }

    private JPanel createTitlePanel() {      //Title画面の作成

        JPanel panel = new JPanel();
	panel.setLayout(null);
	JLabel Title  = new JLabel("<html><img src='file:numeron.jpg' width=300 height=300></html>");
	// 	JLabel Title2 = new JLabel("<html><img src='file:numeron4.jpg' width=350 height=250></html>");
	Title.setBounds(30, 180, 600, 500);
	//	Title2.setBounds(920, 135, 500, 400);
        JLabel label = new JLabel("////------NUMERON------////");
	JLabel label2 = new JLabel("~~~伝説の数字当てゲーム~~~");
	JLabel rule1 = new JLabel("ルールは簡単！");
	JLabel rule2 = new JLabel("①難易度に応じた桁数の数字を入力！");
	JLabel rule3 = new JLabel("②数字だけが一致するとバイト(BITE),");
	JLabel rule3_2 = new JLabel("数字と桁が一致するとイート(EAT)だ！");
	JLabel rule4 = new JLabel("③限られた回数以内に相手の数字を当てると勝利！");

        label.setFont(new Font("Century", Font.ITALIC, 70));
	label2.setFont(new Font("Century", Font.ITALIC, 30));
        rule1.setFont(new Font("Century", Font.ITALIC, 30));
	rule2.setFont(new Font("Century", Font.ITALIC, 30));
	rule3.setFont(new Font("Century", Font.ITALIC, 30));
	rule3_2.setFont(new Font("Century", Font.ITALIC, 30));
	rule4.setFont(new Font("Century", Font.ITALIC, 30));

	label.setBounds(140, 100, 1600, 100);
	label2.setBounds(400,150, 500, 100);
	rule1.setBounds(300, 200, 500, 100);
	rule2.setBounds(350, 250, 500, 100);
	rule3.setBounds(350, 300, 700, 100);
	rule3_2.setBounds(390, 350, 700, 100);
	rule4.setBounds(350, 400, 700, 100);
	
         label.setLayout(new BoxLayout(label, BoxLayout.PAGE_AXIS));
	 label2.setLayout(new BoxLayout(label2, BoxLayout.PAGE_AXIS));
         rule1.setLayout(new BoxLayout(rule1, BoxLayout.PAGE_AXIS));
         rule2.setLayout(new BoxLayout(rule2, BoxLayout.PAGE_AXIS));
         rule3.setLayout(new BoxLayout(rule3, BoxLayout.PAGE_AXIS));
	 rule3_2.setLayout(new BoxLayout(rule3_2, BoxLayout.PAGE_AXIS));
	 rule4.setLayout(new BoxLayout(rule4, BoxLayout.PAGE_AXIS));
	 
	 Container contentPane = getContentPane();
	 contentPane.add(label);
	 contentPane.add(label2);
	 contentPane.add(rule1);
	 contentPane.add(rule2);
	 contentPane.add(rule3);
	 contentPane.add(rule3_2);
	 contentPane.add(rule4);
   
	  panel.add(Title);
	  //	  panel.add(Title2);
	  panel.add(label);
	  panel.add(label2);
	  panel.add(rule1);
	  panel.add(rule2);
          panel.add(rule3);
	  panel.add(rule3_2);
	  panel.add(rule4);


	JButton stert = new JButton("Start");    //startボタンの設定
	stert.setForeground(Color.BLUE);
	stert.setBackground(Color.YELLOW);
        stert.setFont(new Font("Century", Font.ITALIC, 70));
	stert.setBounds(400, 560, 250, 100);
	//  stert.setSize(250, 100);
	// stert.setLocation(400, 500);
        stert.addActionListener(new ActionListener() {        //startボタン押したら画面遷移
            @Override
            public void actionPerformed(ActionEvent e) {
                //selPanel を表示します
                ((CardLayout)(cardPanel.getLayout())).show(cardPanel, SELECT_PANEL);
            }
        });
        panel.add(stert);  //startボタン設置

        JButton end = new JButton("End");     //endボタンの設定
	end.setForeground(Color.RED);
	end.setBackground(Color.BLACK);
        end.setFont(new Font("Century", Font.ITALIC, 70));
	end.setBounds(700, 560, 250, 100);
	//      end.setSize(250, 100);
	// end.setLocation(700, 500);
        end.addActionListener(new ActionListener() { //endボタンを押したらウィンドウ閉じる
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        panel.add(end);    //endボタン設置
	//		Title2.setVisible(true);
	panel.setVisible(true);
        return panel;
    }

    private JPanel createSelectPanel() {     //難易度選択画面の作成
	JLabel Title  = new JLabel("<html><img src='file:numeron.jpg' width=300 height=300></html>",JLabel.CENTER);
        JLabel title = new JLabel("///---Serect Level---///");
        JPanel panel=new JPanel(null);
	//  JButton button=new JButton();
        title.setLayout(new BoxLayout(title, BoxLayout.PAGE_AXIS));
        title.setFont(new Font("MS 明朝", Font.PLAIN, 80));
        title.setBounds(170, 100, 1600, 100);
        panel.add(title);
   
	/* String easy = "Easy";
	   easy.setFont(new Font("Century",Font.ITALIC, 40));*/


     JButton button1 = new JButton("Easy");
       button1.setFont(new Font("Century", Font.ITALIC, 40));
	button1.setBackground(Color.CYAN);
	button1.setForeground(Color.BLUE);
        button1.setSize(150, 70);
        button1.setLocation(300, 300);
        button1.setActionCommand("3");
        //button1.addActionListener(this);

        JButton button2 = new JButton("Normal");
	button2.setFont(new Font("Century", Font.ITALIC, 33));
	button2.setBackground(Color.GREEN);
	button2.setForeground(Color.MAGENTA);
        button2.setSize(150, 70);
        button2.setLocation(300, 400);
        button2.setActionCommand("3");
        //button2.addActionListener(this);

        JButton button3 = new JButton("Hard");
	button3.setFont(new Font("Century", Font.ITALIC, 40));
	button3.setBackground(Color.RED);
	button3.setForeground(Color.BLACK);
        button3.setSize(150, 70);
        button3.setLocation(300, 500);
        button3.setActionCommand("3");
        //button3.addActionListener(this);





	button1.addActionListener(new ActionListener() {        //easyボタン押したら画面遷移
            @Override
            public void actionPerformed(ActionEvent e) {
		//３桁
		new Inputmid();
           
            }
	    });

		button2.addActionListener(new ActionListener() {        //normalボタン押したら画面遷移
            @Override
            public void actionPerformed(ActionEvent e) {
		//4桁
		new Inputmid2();
           
            }
	    });


	       	button3.addActionListener(new ActionListener() {        //hardボタン押したら画面遷移
            @Override
            public void actionPerformed(ActionEvent e) {
		//5桁
		new Inputmid3();
           
            }
	    });

	






	
        JButton button4 = new JButton("Back to Title");
	button4.setFont(new Font("Century", Font.ITALIC, 25));
        button4.setSize(300, 50);
        button4.setLocation(550, 600);
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //defPanel を表示します
                ((CardLayout)(cardPanel.getLayout())).show(cardPanel, TITLE_PANEL);
            }
        });
        JTextField txt = new JTextField("３つの数字を当てる(初心者の方はまずはここから！）");
	txt.setFont(new Font("Century", Font.ITALIC, 25));
        txt.setSize(600, 60);
        txt.setLocation(500, 300);
        txt.setEditable(false);
        JTextField ptxt = new JTextField("４つの数字を当てる（経験者の方にオススメ！）");
	ptxt.setFont(new Font("Century", Font.ITALIC, 25));
        ptxt.setSize(600, 60);
        ptxt.setLocation(500, 400);
        ptxt.setEditable(false);
        JTextField stxt = new JTextField("５つの数字を当てる（天才の方はこちら！）");
	stxt.setFont(new Font("Century", Font.ITALIC, 25));
        stxt.setSize(600, 60);
        stxt.setLocation(500, 500);
        stxt.setEditable(false);
        JTextField sp = new JTextField(" ");
        sp.setEditable(false);
        // txt.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.removeAll();
	
	panel.add(Title);

	panel.add(title);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(txt);
        panel.add(ptxt);
        panel.add(stxt);
        panel.add(sp);

        return panel;

    }
}

class Inputmid extends JFrame implements ActionListener {//3桁のヌメロン
    private JFrame f;
    private JTextField input;
    private JLabel label1,label2,label3,label4,label5,label6;
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    JPanel p4 = new JPanel();
    JPanel num = new JPanel();
    JPanel eat = new JPanel();
    JPanel bite = new JPanel();
    int answer[] = new int[3];
    int c = 1;
    JScrollPane scrol;
    //JTextArea area1;

    public void get_answer3() {
	int f = 0;
	Random r = new Random();
	int k = r.nextInt(10);
	while(f == 0) {
	    if(k == 0) {
		k = r.nextInt(10);
	    } else {
		f = 1;
	    }
	}
	answer[0] = k;
	k = r.nextInt(10);
	f = 0;
	while(f == 0) {
	    if(answer[0] == k) {
		k = r.nextInt(10);
	    } else {
		f = 1;
	    }
	}
	answer[1] = k;
	k = r.nextInt(10);
	f = 0;
	while(f == 0) {
	    if(answer[0] == k || answer[1] == k) {
	        k = r.nextInt(10);
	    } else {
		f = 1;
	    }
	}
	answer[2] = k;
	
    }
    public String get_bite(String s) {
	int i,j,bite=0;
	int n = Integer.parseInt(s);
	int a[] = new int[3];
	a[0] = n/100;
	a[1] = (n/10)%10;
	a[2] = n%10; 
	for(i=0; i<3; i++) {
	    for(j=0; j<3; j++) {
		if(a[j] == answer[i]) {
		    bite++;
		}
	    }
	    if(a[i] == answer[i]) {
		--bite;
	    }
	}
	return Integer.toString(bite);					
    }
    
    public String get_eat(String s) {
	int i, n = Integer.parseInt(s);
	int eat = 0;
	int a[] = new int[3];
	a[0] = n / 100;
	a[1] = (n / 10) % 10;
	a[2] = n % 10;
	
	for(i = 0;i < 3; ++i) {
	    if(answer[i] == a[i]) {
		++eat;
	    }
	}
	return Integer.toString(eat);
    }
    
    public Inputmid() {
	this.setSize(300,800);//画面の大きさ
	//	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//setLayout(new GridLayout(5,2));
	input = new JTextField(50);//入力場所
	this.add(input,BorderLayout.SOUTH);
	this.get_answer3();//答えの生成

	label1 = new JLabel(" ",JLabel.CENTER);
	label2 = new JLabel(" ",JLabel.CENTER);
	label3 = new JLabel(" ",JLabel.CENTER);
	label4 = new JLabel("入力",JLabel.CENTER);
	label5 = new JLabel("eat",JLabel.CENTER);
	label6 = new JLabel("bite",JLabel.CENTER);
	p1.setLayout(new GridLayout(10, 1));
	//scrol = new JScrollPane(p1);
	//this.add(scrol);
	p2.setLayout(new GridLayout(1,3));
	num.add(label1,BorderLayout.CENTER);
	eat.add(label2,BorderLayout.CENTER);
	bite.add(label3,BorderLayout.CENTER);
	p1.add(num);p1.add(eat);p1.add(bite);
	p2.add(label4);p2.add(label5);p2.add(label6);
	this.add(p2,BorderLayout.NORTH);
     
	input.addActionListener(this);
	this.setVisible(true);

	
	getContentPane().add(scrol, BorderLayout.CENTER);
	//getContentPane().add(p2, BorderLayout.SOUTH);
    }
    public void actionPerformed(ActionEvent ev) {
	JPanel p4 = new JPanel();
	JLabel label7;
	String s1 = input.getText();
	String s2 = get_eat(s1);//eatの数
	String s3 = get_bite(s1);//biteの数
	JPanel p3 = new JPanel();
	if(s1.length() == 3) {  //入力文字数制限
	    p3.setLayout(new GridLayout(1, 3));
	    label7 = new JLabel("Faild",JLabel.CENTER);
	    c = c + 1;
	    label1.setText(s1);
	    label2.setText(s2);
	    label3.setText(s3);
	    p3.add(num);p3.add(eat);p3.add(bite);
	    p1.add(p3,BorderLayout.CENTER);
	    input.setText("");
	    if(c > 10) { //10回以上で失敗
		input.setText("失敗です...残念！");
		input.setEditable(false);
	    } else if(get_eat(s1).equals(Integer.toString(3))) {
		input.setText("成功です！！おめでとう！！！");
		input.setEditable(false);
	    }
	    revalidate();
	}
    }
    
}


class Inputmid2 extends JFrame implements ActionListener {//4桁のヌメロン
    private JFrame f;
    private JTextField input;
    private JLabel label1,label2,label3,label4,label5,label6;
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    JPanel p4 = new JPanel();
    JPanel num = new JPanel();
    JPanel eat = new JPanel();
    JPanel bite = new JPanel();
    int answer[] = new int[4];
    int c = 1;
    JScrollPane scrol;
    //JTextArea area1;

    public void get_answer4() {
	int f = 0;
	Random r = new Random();
	int k = r.nextInt(10);
	while(f == 0) {
	    if(k == 0) {
		k = r.nextInt(10);
	    } else {
		f = 1;
	    }
	}
	answer[0] = k;
	k = r.nextInt(10);
	f = 0;
	while(f == 0) {
	    if(answer[0] == k) {
		k = r.nextInt(10);
	    } else {
		f = 1;
	    }
	}
	answer[1] = k;
	k = r.nextInt(10);
	f = 0;
	while(f == 0) {
	    if(answer[0] == k || answer[1] == k) {
	        k = r.nextInt(10);
	    } else {
		f = 1;
	    }
	}
	answer[2] = k;
	k = r.nextInt(10);
	f = 0;
    	while(f == 0) {
	    if(answer[0] == k || answer[1] == k || answer[2] == k) {
		k = r.nextInt(10);
	    } else {
		f = 1;
	    }
	}
	answer[3] = k;
	
    }
    public String get_bite(String s) {
	int i,j,bite=0;
	int n = Integer.parseInt(s);
	int a[] = new int[4];
	a[0] = n/1000;
	a[1] = (n/100)%10;
	a[2] = (n/10)%10;
	a[3] = n%10; 
	for(i=0; i<4; i++) {
	    for(j=0; j<4; j++) {
		if(a[j] == answer[i]) {
		    bite++;
		}
	    }
	    if(a[i] == answer[i]) {
		--bite;
	    }
	}
	return Integer.toString(bite);					
    }
    
    public String get_eat(String s) {
	int i, n = Integer.parseInt(s);
	int eat = 0;
	int a[] = new int[4];
	a[0] = n / 1000;
	a[1] = (n / 100) % 10;
	a[2] = (n / 10) % 10;
	a[3] = n % 10;
	
	for(i = 0;i < 4; ++i) {
	    if(answer[i] == a[i]) {
		++eat;
	    }
	}
	return Integer.toString(eat);
    }
    
    public Inputmid2() {
	this.setSize(300,800);
	//	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//setLayout(new GridLayout(5,2));
	input = new JTextField(50);
	this.add(input,BorderLayout.SOUTH);
	this.get_answer4();

	label1 = new JLabel(" ",JLabel.CENTER);
	label2 = new JLabel(" ",JLabel.CENTER);
	label3 = new JLabel(" ",JLabel.CENTER);
	label4 = new JLabel("入力",JLabel.CENTER);
	label5 = new JLabel("eat",JLabel.CENTER);
	label6 = new JLabel("bite",JLabel.CENTER);
	p1.setLayout(new GridLayout(20, 1));
	scrol = new JScrollPane(p1);
	//this.add(scrol);
	p2.setLayout(new GridLayout(1,3));
	num.add(label1,BorderLayout.CENTER);
	eat.add(label2,BorderLayout.CENTER);
	bite.add(label3,BorderLayout.CENTER);
	p1.add(num);p1.add(eat);p1.add(bite);
	p2.add(label4);p2.add(label5);p2.add(label6);
	this.add(p2,BorderLayout.NORTH);
      
	input.addActionListener(this);
	this.setVisible(true);

	
	getContentPane().add(scrol, BorderLayout.CENTER);
	//getContentPane().add(p2, BorderLayout.SOUTH);
    }
    public void actionPerformed(ActionEvent ev) {
	JPanel p4 = new JPanel();
	JLabel label7;
	String s1 = input.getText();
	String s2 = get_eat(s1);
	String s3 = get_bite(s1);
	JPanel p3 = new JPanel();
	if(s1.length() == 4) {  //入力文字数制限
	    p3.setLayout(new GridLayout(1, 3));
	    label7 = new JLabel("Faild",JLabel.CENTER);
	    c = c + 1;
	    label1.setText(s1);
	    label2.setText(s2);
	    label3.setText(s3);
	    p3.add(num);p3.add(eat);p3.add(bite);
	    p1.add(p3,BorderLayout.CENTER);
	    input.setText("");
	    if(c > 20) { //20回以上で失敗
		input.setText("失敗です...残念！");
		input.setEditable(false);
	    } else if(get_eat(s1).equals(Integer.toString(4))) {
		input.setText("成功です！！おめでとう！！！");
		input.setEditable(false);
	    }
	    revalidate();
	}
    }
    
   
}

class Inputmid3 extends JFrame implements ActionListener {//５桁のヌメロン
    private JFrame f;
    private JTextField input;
    private JLabel label1,label2,label3,label4,label5,label6;
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    JPanel p4 = new JPanel();
    JPanel num = new JPanel();
    JPanel eat = new JPanel();
    JPanel bite = new JPanel();
    int answer[] = new int[5];
    int c = 1;
    JScrollPane scrol;
    //JTextArea area1;

    public void get_answer5() {
	int f = 0;
	Random r = new Random();
	int k = r.nextInt(10);
	while(f == 0) {
	    if(k == 0) {
		k = r.nextInt(10);
	    } else {
		f = 1;
	    }
	}
	answer[0] = k;
	k = r.nextInt(10);
	f = 0;
	while(f == 0) {
	    if(answer[0] == k) {
		k = r.nextInt(10);
	    } else {
		f = 1;
	    }
	}
	answer[1] = k;
	k = r.nextInt(10);
	f = 0;
	while(f == 0) {
	    if(answer[0] == k || answer[1] == k) {
	        k = r.nextInt(10);
	    } else {
		f = 1;
	    }
	}
	answer[2] = k;
	k = r.nextInt(10);
	f = 0;
    	while(f == 0) {
	    if(answer[0] == k || answer[1] == k || answer[2] == k) {
		k = r.nextInt(10);
	    } else {
		f = 1;
	    }
	}
	answer[3] = k;
	k = r.nextInt(10);
	f = 0;
	while(f == 0) {
	    if(answer[0] == k || answer[1] == k || answer[2] == k || answer[3] == k) {
	        k = r.nextInt(10);
	    } else {
		f = 1;
	    }
	}
	answer[4] = k;
	
    }
    public String get_bite(String s) {
	int i,j,bite=0;
	int n = Integer.parseInt(s);
	int a[] = new int[5];
	a[0] = n/10000;
	a[1] = (n/1000)%10;
	a[2] = (n/100)%10;
	a[3] = (n/10)%10;
	a[4] = n%10; 
	for(i=0; i<5; i++) {
	    for(j=0; j<5; j++) {
		if(a[j] == answer[i]) {
		    bite++;
		}
	    }
	    if(a[i] == answer[i]) {
		--bite;
	    }
	}
	return Integer.toString(bite);					
    }
    
    public String get_eat(String s) {
	int i, n = Integer.parseInt(s);
	int eat = 0;
	int a[] = new int[5];
	a[0] = n / 10000;
	a[1] = (n / 1000) % 10;
	a[2] = (n / 100) % 10;
	a[3] = (n / 10) % 10;
	a[4] = n % 10;
	
	for(i = 0;i < 5; ++i) {
	    if(answer[i] == a[i]) {
		++eat;
	    }
	}
	return Integer.toString(eat);
    }
    
    public Inputmid3() {
	this.setSize(300,800);
	//	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//setLayout(new GridLayout(5,2));
	input = new JTextField(50);
	this.add(input,BorderLayout.SOUTH);
	this.get_answer5();

	label1 = new JLabel(" ",JLabel.CENTER);
	label2 = new JLabel(" ",JLabel.CENTER);
	label3 = new JLabel(" ",JLabel.CENTER);
	label4 = new JLabel("入力",JLabel.CENTER);
	label5 = new JLabel("eat",JLabel.CENTER);
	label6 = new JLabel("bite",JLabel.CENTER);
	p1.setLayout(new GridLayout(30, 1));
	scrol = new JScrollPane(p1);
	//this.add(scrol);
	p2.setLayout(new GridLayout(1,3));
	num.add(label1,BorderLayout.CENTER);
	eat.add(label2,BorderLayout.CENTER);
	bite.add(label3,BorderLayout.CENTER);
	p1.add(num);p1.add(eat);p1.add(bite);
	p2.add(label4);p2.add(label5);p2.add(label6);
	this.add(p2,BorderLayout.NORTH);
      
	input.addActionListener(this);
	this.setVisible(true);

	
	getContentPane().add(scrol, BorderLayout.CENTER);
	//getContentPane().add(p2, BorderLayout.SOUTH);
    }
    public void actionPerformed(ActionEvent ev) {
	JPanel p4 = new JPanel();
	//JLabel label7;
	String s1 = input.getText();
	String s2 = get_eat(s1);
	String s3 = get_bite(s1);
	JPanel p3 = new JPanel();
	if(s1.length() == 5) {  //入力文字数制限
	    p3.setLayout(new GridLayout(1, 3));
	    //label7 = new JLabel("Faild",JLabel.CENTER);
	    c = c + 1;
	    label1.setText(s1);
	    label2.setText(s2);
	    label3.setText(s3);
	    p3.add(num);p3.add(eat);p3.add(bite);
	    p1.add(p3,BorderLayout.CENTER);
	    input.setText("");
	    if(c > 20) { //20回以上で失敗
		input.setText("失敗です...残念！");
		input.setEditable(false);
	    } else if(get_eat(s1).equals(Integer.toString(5))) {
		input.setText("成功です！！おめでとう！！！");
		input.setEditable(false);
	    }
	    revalidate();
	}
    }
    
 
}