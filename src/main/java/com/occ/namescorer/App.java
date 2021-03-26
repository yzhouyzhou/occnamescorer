package com.occ.namescorer;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import com.occ.factory.NameScorer;
import com.occ.service.impl.NameListReader;
import com.occ.service.impl.NameScoreCalculator;
import com.occ.util.LoggerUtil;
import com.occ.util.TimerWatchUtil;

/**
 * Ying Zhou
 * 
 * To score a list of names, sort it alphabetically and sum the individual scores 
 * for all the names. To score a name, sum the alphabetical value of each letter (A=1, B=2, 
 * C=3, etc...) and multiply the sum by the name’s position in the list (1-based).
 * For example, when the sample data below is sorted into alphabetical order, LINDA, 
 * which is worth 12 + 9 + 14 + 4 + 1 = 40, is the 4th name in the list. So, LINDA would 
 * obtain a score of 40 x 4 = 160.
 *
 */
public class App 
{
	public static void main(String[] args) {		
		
		if (args.length != 1) {
			LoggerUtil.log("Expected arg: <filename>");
		} else {
			TimerWatchUtil.startTimer();
			LoggerUtil.log("TotalScore = " + new App().scoreNames(args[0]));
			TimerWatchUtil.timeTaken();
		}	
	}
	
	public int scoreNames(String p_file)  {		
		try {
			NameScorer scorer = new NameScorer(new NameListReader(), new NameScoreCalculator());
			return scorer.calculateListScore(new URL("file:" + new File(p_file).getCanonicalPath()));
		} catch (IOException e) {
			LoggerUtil.log("The filename [ " + p_file + " ] can not be processed.");
			return 0;
		} catch (Exception e) {
			LoggerUtil.log("The data can not be processed with unknown issues.");
			return 0;
		}	
	}
}
