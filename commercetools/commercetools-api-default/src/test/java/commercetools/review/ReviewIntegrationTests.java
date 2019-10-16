package commercetools.review;

import com.commercetools.api.generated.models.review.*;
import commercetools.utils.CommercetoolsTestUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ReviewIntegrationTests {
    
    @Test
    public void createAndDelete(){
        ReviewDraft reviewDraft = ReviewDraftBuilder.of()
                .key(CommercetoolsTestUtils.randomKey())
                .title("review-title-1")
                .build();

        Review review = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                .reviews()
                .post(reviewDraft)
                .executeBlocking().getBody();

        Assert.assertNotNull(review);
        Assert.assertEquals(reviewDraft.getKey(), review.getKey());
        
        Review deletedReview = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                .reviews()
                .withId(review.getId())
                .delete()
                .addVersion(review.getVersion())
                .executeBlocking().getBody();

        Assert.assertNotNull(deletedReview);
        Assert.assertEquals(deletedReview.getId(), review.getId());
    }
 
    @Test
    public void getById() {
        ReviewFixtures.withReview(review -> {
            Review queriedReview = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .reviews()
                    .withId(review.getId())
                    .get()
                    .executeBlocking().getBody();
            Assert.assertNotNull(queriedReview);
            Assert.assertEquals(queriedReview.getId(), review.getId());
        });
    }
    
    @Test
    public void getByKey(){
        ReviewFixtures.withReview(review -> {
            Review queriedReview = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .reviews()
                    .withKey(review.getKey())
                    .get()
                    .executeBlocking().getBody();
            Assert.assertNotNull(queriedReview);
            Assert.assertEquals(queriedReview.getKey(), review.getKey());
        });
    }    
    
    @Test
    public void query(){
        ReviewFixtures.withReview(review -> {
            ReviewPagedQueryResponse response = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .reviews()
                    .get()
                    .addWhere("id=" + "\"" + review.getId() +"\"")
                    .executeBlocking().getBody();
            Assert.assertNotNull(response);
            Assert.assertEquals(response.getResults().get(0).getId(), review.getId());
        });
    }
    
    @Test
    public void updateById(){
        ReviewFixtures.withUpdateableReview(review -> {
            List<ReviewUpdateAction> updateActions = new ArrayList<>();
            String newKey = CommercetoolsTestUtils.randomKey();
            updateActions.add(ReviewSetKeyActionBuilder.of().key(newKey).build());
            
            Review updatedReview = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .reviews()
                    .withId(review.getId())
                    .post(ReviewUpdateBuilder.of()
                        .actions(updateActions)
                        .version(review.getVersion())
                        .build())
                    .executeBlocking().getBody();

            Assert.assertNotNull(updatedReview);
            Assert.assertEquals(updatedReview.getKey(), newKey);
            
            return updatedReview;
        });
    }

    @Test
    public void updateByKey(){
        ReviewFixtures.withUpdateableReview(review -> {
            List<ReviewUpdateAction> updateActions = new ArrayList<>();
            String newKey = CommercetoolsTestUtils.randomKey();
            updateActions.add(ReviewSetKeyActionBuilder.of().key(newKey).build());

            Review updatedReview = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .reviews()
                    .withKey(review.getKey())
                    .post(ReviewUpdateBuilder.of()
                            .actions(updateActions)
                            .version(review.getVersion())
                            .build())
                    .executeBlocking().getBody();

            Assert.assertNotNull(updatedReview);
            Assert.assertEquals(updatedReview.getKey(), newKey);

            return updatedReview;
        });
    }
}
