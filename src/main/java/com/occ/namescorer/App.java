package com.occ.namescorer;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

import com.occ.factory.NameScorer;
import com.occ.service.impl.NameListReader;
import com.occ.service.impl.NameScoreCalculator;
import com.occ.util.LoggerUtil;
import com.occ.util.TimerWatchUtil;

/**
 * Ying Zhou
 *
 */
public class App 
{
	public static void main(String[] args) {
		LoggerUtil.log("Please enter the file name: ");
		Scanner scanner = new Scanner(System.in);
		
		TimerWatchUtil.startTimer();
		LoggerUtil.log("TotalScore = " + new App().scoreNames(scanner.nextLine()));
		TimerWatchUtil.timeTaken();
		
		scanner.close();
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
