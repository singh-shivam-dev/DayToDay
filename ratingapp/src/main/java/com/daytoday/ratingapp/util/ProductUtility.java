package com.daytoday.ratingapp.util;

import com.daytoday.ratingapp.model.Comment;
import com.daytoday.ratingapp.model.Product;
import com.daytoday.ratingapp.model.Rating;

public class ProductUtility {
	public void getRatingDetails(Product prod) {
		float ratingSum = 0;
		float avgRating = 0;
		int zeroRatingCount = 0;
		int oneRatingCount = 0;
		int twoRatingCount = 0;
		int threeRatingCount = 0;
		int fourRatingCount = 0;
		int fiveRatingCount = 0;
		for(Comment cmnt : prod.getComment()) {
			ratingSum += cmnt.getRating();
			if(cmnt.getRating() == 0) {
				zeroRatingCount++;
			}else if(cmnt.getRating() == 1) {
				oneRatingCount++;
			}else if(cmnt.getRating() == 2) {
				twoRatingCount++;
			}else if(cmnt.getRating() == 3) {
				threeRatingCount++;
			}else if(cmnt.getRating() == 4) {
				fourRatingCount++;
			}else if(cmnt.getRating() == 5) {
				fiveRatingCount++;
			}
		}
		avgRating = ratingSum/prod.getComment().size();
		Rating ratingData = new Rating();
		ratingData.setAverageRating((avgRating));
		ratingData.setRatingZeroCount(zeroRatingCount);
		ratingData.setRatingOneCount(oneRatingCount);
		ratingData.setRatingTwoCount(twoRatingCount);
		ratingData.setRatingThreeCount(threeRatingCount);
		ratingData.setRatingFourCount(fourRatingCount);
		ratingData.setRatingFiveCount(fiveRatingCount);
		prod.setRatingData(ratingData);
	}
}
