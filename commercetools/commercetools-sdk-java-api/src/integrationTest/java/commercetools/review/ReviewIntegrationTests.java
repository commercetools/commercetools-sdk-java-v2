
package commercetools.review;

import static commercetools.review.ReviewFixtures.*;

import java.util.ArrayList;
import java.util.List;

import com.commercetools.api.models.review.*;
import commercetools.utils.CommercetoolsTestUtils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReviewIntegrationTests {

    @Test
    public void createAndDelete() {
        ReviewDraft reviewDraft = ReviewDraftBuilder.of()
                .key(CommercetoolsTestUtils.randomKey())
                .title("review-title-1")
                .build();

        Review review = CommercetoolsTestUtils.getProjectApiRoot()
                .reviews()
                .post(reviewDraft)
                .executeBlocking()
                .getBody();

        Assertions.assertNotNull(review);
        Assertions.assertEquals(reviewDraft.getKey(), review.getKey());

        Review deletedReview = CommercetoolsTestUtils.getProjectApiRoot()
                .reviews()
                .withId(review.getId())
                .delete()
                .withVersion(review.getVersion())
                .executeBlocking()
                .getBody();

        Assertions.assertNotNull(deletedReview);
        Assertions.assertEquals(deletedReview.getId(), review.getId());
    }

    @Test
    public void getById() {
        withReview(review -> {
            Review queriedReview = CommercetoolsTestUtils.getProjectApiRoot()
                    .reviews()
                    .withId(review.getId())
                    .get()
                    .executeBlocking()
                    .getBody();
            Assertions.assertNotNull(queriedReview);
            Assertions.assertEquals(queriedReview.getId(), review.getId());
        });
    }

    @Test
    public void getByKey() {
        withReview(review -> {
            Review queriedReview = CommercetoolsTestUtils.getProjectApiRoot()
                    .reviews()
                    .withKey(review.getKey())
                    .get()
                    .executeBlocking()
                    .getBody();
            Assertions.assertNotNull(queriedReview);
            Assertions.assertEquals(queriedReview.getKey(), review.getKey());
        });
    }

    @Test
    public void query() {
        withReview(review -> {
            ReviewPagedQueryResponse response = CommercetoolsTestUtils.getProjectApiRoot()
                    .reviews()
                    .get()
                    .withWhere("id=" + "\"" + review.getId() + "\"")
                    .executeBlocking()
                    .getBody();
            Assertions.assertNotNull(response);
            Assertions.assertEquals(response.getResults().get(0).getId(), review.getId());
        });
    }

    @Test
    public void updateById() {
        withUpdateableReview(review -> {
            List<ReviewUpdateAction> updateActions = new ArrayList<>();
            String newKey = CommercetoolsTestUtils.randomKey();
            updateActions.add(ReviewSetKeyActionBuilder.of().key(newKey).build());

            Review updatedReview = CommercetoolsTestUtils.getProjectApiRoot()
                    .reviews()
                    .withId(review.getId())
                    .post(ReviewUpdateBuilder.of().actions(updateActions).version(review.getVersion()).build())
                    .executeBlocking()
                    .getBody();

            Assertions.assertNotNull(updatedReview);
            Assertions.assertEquals(updatedReview.getKey(), newKey);

            return updatedReview;
        });
    }

    @Test
    public void updateByKey() {
        withUpdateableReview(review -> {
            List<ReviewUpdateAction> updateActions = new ArrayList<>();
            String newKey = CommercetoolsTestUtils.randomKey();
            updateActions.add(ReviewSetKeyActionBuilder.of().key(newKey).build());

            Review updatedReview = CommercetoolsTestUtils.getProjectApiRoot()
                    .reviews()
                    .withKey(review.getKey())
                    .post(ReviewUpdateBuilder.of().actions(updateActions).version(review.getVersion()).build())
                    .executeBlocking()
                    .getBody();

            Assertions.assertNotNull(updatedReview);
            Assertions.assertEquals(updatedReview.getKey(), newKey);

            return updatedReview;
        });
    }
}
