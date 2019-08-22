import java.io.IOException;

public class Analysis {

	public static void main(String[] args) throws IOException {

		String text = "here the work culture is good worst";
		
		SentimentAnalyzer sentimentAnalyzer = new SentimentAnalyzer();
		sentimentAnalyzer.initialize();
		SentimentResult sentimentResult = sentimentAnalyzer.getSentimentResult(text);

		System.out.println("Sentiment Score: " + sentimentResult.getSentimentScore());
		System.out.println("Sentiment Type: " + sentimentResult.getSentimentType());
		System.out.println("Very positive: " + sentimentResult.getSentimentClass().getVeryPositive()+"%");
		System.out.println("Positive: " + sentimentResult.getSentimentClass().getPositive()+"%");
		System.out.println("Neutral: " + sentimentResult.getSentimentClass().getNeutral()+"%");
		System.out.println("Negative: " + sentimentResult.getSentimentClass().getNegative()+"%");
		System.out.println("Very negative: " + sentimentResult.getSentimentClass().getVeryNegative()+"%");

//		String[] str = {
//				" ala 187238 owieoiwue",
//				" bubba )(&(*^&%*^%&^% 92837 ",
//				"koko **&*&^ ... ,kkkd"
//		};
//
//		for( String s: str){
//			s.replaceAll("\\d++", "");
//			System.out.println(s.replaceAll("[^\\w]", ""));
//		}

	}

}
