package commercetools.review;

import com.commercetools.api.generated.models.channel.Channel;
import com.commercetools.api.generated.models.customer.Customer;
import com.commercetools.api.generated.models.customer.CustomerResourceIdentifierBuilder;
import com.commercetools.api.generated.models.review.Review;
import com.commercetools.api.generated.models.review.ReviewDraft;
import com.commercetools.api.generated.models.review.ReviewDraftBuilder;
import com.commercetools.api.generated.models.state.*;
import commercetools.channel.ChannelFixtures;
import commercetools.customer.CustomerFixtures;
import commercetools.utils.CommercetoolsTestUtils;
import org.junit.Assert;

import java.util.UUID;
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
        
        Channel channel = ChannelFixtures.createChannel();
        Customer customer = CustomerFixtures.createCustomer();
        
        StateDraft stateDraft = StateDraftBuilder.of()
                .type(StateTypeEnum.REVIEW_STATE)
                .key(CommercetoolsTestUtils.randomKey())
                .build();

        State state = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                .states()
                .post(stateDraft)
                .executeBlocking().getBody();
        
        ReviewDraft reviewDraft = ReviewDraftBuilder.of()
                .key(CommercetoolsTestUtils.randomKey())
                .uniquenessValue(UUID.randomUUID().toString())
                .locale("de")
                .authorName(CommercetoolsTestUtils.randomString())
                .title("review-title-1")
                .text(CommercetoolsTestUtils.randomString())
                //TODO see why this doesn't work
                //.target(ChannelResourceIdentifierBuilder.of().id(channel.getId()).build())
                .state(StateResourceIdentifierBuilder.of().id(state.getId()).build())
                .rating(50)
                .customer(CustomerResourceIdentifierBuilder.of().id(customer.getId()).build())
                .build();

        Review review = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                .reviews()
                .post(reviewDraft)
                .executeBlocking().getBody();

        Assert.assertNotNull(review);
        Assert.assertEquals(reviewDraft.getKey(), review.getKey());
        
        return review;
    }
    
    public static Review delete(final String id, final Long version) {
        Review deletedReview = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                .reviews()
                .withId(id)
                .delete()
                .addVersion(version)
                .executeBlocking().getBody();

        Assert.assertNotNull(deletedReview);
        Assert.assertEquals(deletedReview.getId(), id);
        
        return deletedReview;
    }
    
}
