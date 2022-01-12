
package commercetools.review;

import static commercetools.customer.CustomerFixtures.*;
import static commercetools.state.StateFixtures.*;

import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

import com.commercetools.api.models.customer.Customer;
import com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder;
import com.commercetools.api.models.review.Review;
import com.commercetools.api.models.review.ReviewDraft;
import com.commercetools.api.models.review.ReviewDraftBuilder;
import com.commercetools.api.models.state.*;
import commercetools.utils.CommercetoolsTestUtils;

import org.junit.jupiter.api.Assertions;

public class ReviewFixtures {

    public static void withReview(final Consumer<Review> consumer) {
        withState(
            StateDraftBuilder.of().type(StateTypeEnum.REVIEW_STATE).key(CommercetoolsTestUtils.randomKey()).build(),
            state -> withCustomer(customer -> {
                Review review = createReview(customer, state);
                try {
                    consumer.accept(review);
                }
                finally {
                    deleteReview(review.getId(), review.getVersion());
                }
            }));
    }

    public static void withUpdateableReview(final UnaryOperator<Review> operator) {
        withState(
            StateDraftBuilder.of().type(StateTypeEnum.REVIEW_STATE).key(CommercetoolsTestUtils.randomKey()).build(),
            state -> withCustomer(customer -> {
                Review review = createReview(customer, state);
                try {
                    review = operator.apply(review);
                }
                finally {
                    deleteReview(review.getId(), review.getVersion());
                }
            }));
    }

    public static Review createReview(Customer customer, State state) {

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

        Review review = CommercetoolsTestUtils.getProjectApiRoot()
                .reviews()
                .post(reviewDraft)
                .executeBlocking()
                .getBody();

        Assertions.assertNotNull(review);
        Assertions.assertEquals(reviewDraft.getKey(), review.getKey());

        return review;
    }

    public static Review deleteReview(final String id, final Long version) {
        Review deletedReview = CommercetoolsTestUtils.getProjectApiRoot()
                .reviews()
                .withId(id)
                .delete()
                .withVersion(version)
                .executeBlocking()
                .getBody();

        Assertions.assertNotNull(deletedReview);
        Assertions.assertEquals(deletedReview.getId(), id);

        return deletedReview;
    }

}
