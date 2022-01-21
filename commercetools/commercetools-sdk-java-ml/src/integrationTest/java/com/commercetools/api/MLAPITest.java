
package com.commercetools.api;

import static org.assertj.core.api.Assertions.assertThat;
import static org.awaitility.Awaitility.await;

import java.util.concurrent.TimeUnit;

import com.commercetools.ml.models.common.TaskStatusEnum;
import com.commercetools.ml.models.common.TaskToken;
import com.commercetools.ml.models.general_category_recommendations.GeneralCategoryRecommendationPagedQueryResponse;
import com.commercetools.ml.models.similar_products.SimilarProductSearchRequestBuilder;
import com.commercetools.ml.models.similar_products.SimilarProductsTaskStatus;

import io.vrap.rmf.base.client.ApiHttpResponse;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class MLAPITest extends TestBase {

    @Test
    public void generalRecommendationsTest() {

        ApiHttpResponse<GeneralCategoryRecommendationPagedQueryResponse> response = mlApiBuilder.recommendations()
                .generalCategories()
                .get()
                .withProductName("vase")
                .executeBlocking();
        assertThat(response.getStatusCode()).isEqualTo(200);
    }

    @Disabled
    @Test
    public void similaritiesTest() {
        ApiHttpResponse<TaskToken> tokenApiHttpResponse = mlApiBuilder.similarities()
                .products()
                .post(new SimilarProductSearchRequestBuilder().build())
                .executeBlocking();

        assertThat(tokenApiHttpResponse.getStatusCode()).isEqualTo(202);
        await().atMost(30, TimeUnit.SECONDS)
                .pollInterval(2, TimeUnit.SECONDS)
                .untilAsserted(() -> assertThat(
                    getSimilarProducts(tokenApiHttpResponse.getBody().getTaskId()).getBody().getState())
                            .isEqualTo(TaskStatusEnum.SUCCESS));
    }

    public ApiHttpResponse<SimilarProductsTaskStatus> getSimilarProducts(final String taskId) {
        return mlApiBuilder.similarities().products().status().withTaskId(taskId).get().executeBlocking();
    }
}
