package commercetools.review;

import com.commercetools.models.Review.Review;
import com.commercetools.models.Review.ReviewDraft;
import com.commercetools.models.Review.ReviewDraftBuilder;
import commercetools.utils.CommercetoolsTestUtils;
import org.junit.jupiter.api.Assertions;

import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class ReviewFixtures {
    
    public static void withReview(final Consumer<Review> consumer) {
        Review review = createReview();
        consumer.accept(review);
        delete(review.getId(), review.getVersion());
    }
    
    public static void withUpdateableReview(final UnaryOperator<Review> operator){
        Review review = createReview();
        review = operator.apply(review);
        delete(review.getId(), review.getVersion());
    }
    
    public static Review createReview() {
        ReviewDraft reviewDraft = ReviewDraftBuilder.of()
                .key(CommercetoolsTestUtils.randomKey())
                .title("review-title-1")
                .build();

        Review review = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                .reviews()
                .post(reviewDraft)
                .executeBlocking();

        Assertions.assertNotNull(review);
        Assertions.assertEquals(reviewDraft.getKey(), review.getKey());
        
        return review;
    }
    
    public static Review delete(final String id, final Long version) {
        Review deletedReview = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                .reviews()
                .withId(id)
                .delete()
                .addVersion(version)
                .executeBlocking();

        Assertions.assertNotNull(deletedReview);
        Assertions.assertEquals(deletedReview.getId(), id);
        
        return deletedReview;
    }
    
}
