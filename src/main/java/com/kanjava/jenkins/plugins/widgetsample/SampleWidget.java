package com.kanjava.jenkins.plugins.widgetsample;

import hudson.Extension;
import hudson.widgets.Widget;

import java.util.List;

import twitter4j.Query;
import twitter4j.Tweet;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

@Extension
public class SampleWidget extends Widget {

    public List<Tweet> getTweets() throws TwitterException {
        return new TwitterFactory().getInstance().search(new Query("#kanjava")).getTweets();
    }

}
