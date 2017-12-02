import java.io.IOException;

import io.indico.Indico;
import io.indico.api.utils.IndicoException;
import processing.core.PApplet;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class TwitterTrends extends PApplet {
	twitter4j.Twitter twitter;
	public static void main (String args []) throws IndicoException, IOException{
		Indico indico = new Indico("fffb17437f582ff382c2c0a44548adff");
	}
	

	public void setup()  {
		
		ConfigurationBuilder cf = new ConfigurationBuilder();
		cf.setDebugEnabled(true).setOAuthConsumerKey("drhkVLT2gxUnrXAA5OPcvjgiO")
				.setOAuthConsumerSecret("KAbU4XlONUI8mVuET8qndxXv134SgF5EniwQe86z9xsyZqnKNl")
				.setOAuthAccessToken("4070884876-Y4IuHm8RQLItOdF7ZpCZYFAEzFn6m3FrpzLv8Yv")
				.setOAuthAccessTokenSecret("p1mR7vHx0ZGTjwwVk22HuPPlPrnj8HgxGvNjddqELrM9i");
		twitter = new TwitterFactory(cf.build()).getInstance();
		twitter4j.Twitter twitter = TwitterFactory.getSingleton();
	}

	public void draw(){
	
	}
}
