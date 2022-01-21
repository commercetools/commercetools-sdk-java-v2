
package com.commercetools;

import static com.commercetools.TestUtils.stringFromResource;
import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;

import com.commercetools.api.models.channel.ChannelReference;
import com.commercetools.api.models.product.ProductReference;
import com.commercetools.api.models.review.Review;

import io.vrap.rmf.base.client.utils.json.JsonUtils;

import org.junit.jupiter.api.Test;

public class ReviewTest {

    @Test
    public void productReview() throws IOException {
        Review review = JsonUtils.fromJsonString(stringFromResource("product-review.json"), Review.class);

        assertThat(review.getTarget()).isInstanceOf(ProductReference.class);
    }

    @Test
    public void channelReview() throws IOException {
        Review review = JsonUtils.fromJsonString(stringFromResource("channel-review.json"), Review.class);

        assertThat(review.getTarget()).isInstanceOf(ChannelReference.class);
    }

}
