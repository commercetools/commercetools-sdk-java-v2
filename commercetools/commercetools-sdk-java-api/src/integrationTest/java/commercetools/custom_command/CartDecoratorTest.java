package commercetools.custom_command;

import com.commercetools.api.client.ByProjectKeyCartsByIDPost;
import com.commercetools.api.client.PagedQueryResourceRequest;
import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.models.cart.*;
import com.commercetools.api.models.category.CategoryPagedQueryResponse;
import com.commercetools.api.models.project.Project;
import commercetools.DecoratorTest;
import commercetools.utils.CommercetoolsTestUtils;
import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.ApiHttpResponse;
import io.vrap.rmf.base.client.CreateHttpRequestCommand;
import io.vrap.rmf.base.client.ResponseSerializer;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.net.URI;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

public class CartDecoratorTest {
    @Test
    public void decoratedClient() {
        final ProjectApiRoot apiRoot = CommercetoolsTestUtils.getProjectApiRoot();
        final DecoratedApiHttpClient client = new DecoratedApiHttpClient(apiRoot.getApiHttpClient());
        final ProjectApiRoot decoratedRoot = ProjectApiRoot.fromClient(apiRoot.getProjectKey(), client);
        final CartDraft cartDraft = CartDraftBuilder.of().currency("EUR").build();

        final CartRecalculateAction cartRecalculateAction
                = CartUpdateActionBuilder.of().recalculateBuilder().build();
        final CartChangeTaxModeAction cartChangeTaxModeAction = CartUpdateActionBuilder.of().changeTaxModeBuilder().taxMode(TaxMode.DISABLED).build();
        final Cart cart = decoratedRoot.carts().create(cartDraft).execute().thenApply(ApiHttpResponse::getBody).join();
        final Cart updatedCart = decoratedRoot.carts()
                .withId(cart.getId())
                .post(IncludeCartCartUpdateBuilder.of()
                        .cart(cart)
                        .version(cart.getVersion())
                        .actions(cartRecalculateAction, cartChangeTaxModeAction)
                        .build()
                )
                .execute()
                .thenApply(ApiHttpResponse::getBody)
                .join();
    }

    public static class DecoratedApiHttpClient implements ApiHttpClient {
        private final ApiHttpClient apiHttpClient;

        private ApiHttpRequest lastRequest;

        public DecoratedApiHttpClient(ApiHttpClient apiHttpClient) {
            this.apiHttpClient = apiHttpClient;
        }

        @Override
        public ResponseSerializer getSerializerService() {
            return apiHttpClient.getSerializerService();
        }

        @Override
        public URI getBaseUri() {
            return apiHttpClient.getBaseUri();
        }

        @Override
        public CompletableFuture<ApiHttpResponse<byte[]>> execute(ApiHttpRequest request) {
            lastRequest = request;
            return apiHttpClient.execute(request);
        }

        @Override
        public <O> CompletableFuture<ApiHttpResponse<O>> execute(CreateHttpRequestCommand request,
                Function<ApiHttpResponse<byte[]>, ApiHttpResponse<O>> mapper) {
            return ApiHttpClient.super.execute(resetLineItemExternalTotals(request), mapper);
        }

        @Override
        public <O> ApiHttpResponse<O> executeBlocking(CreateHttpRequestCommand method,
                Function<ApiHttpResponse<byte[]>, ApiHttpResponse<O>> mapper, Duration timeout) {
            return ApiHttpClient.super.executeBlocking(resetLineItemExternalTotals(method), mapper, timeout);
        }

        @Override
        public CompletableFuture<ApiHttpResponse<byte[]>> send(CreateHttpRequestCommand method) {
            return ApiHttpClient.super.send(resetLineItemExternalTotals(method));
        }

        @Override
        public <T> ApiHttpResponse<byte[]> sendBlocking(CreateHttpRequestCommand method, Duration timeout) {
            return ApiHttpClient.super.sendBlocking(resetLineItemExternalTotals(method), timeout);
        }

        @Override
        public void close() throws Exception {
            apiHttpClient.close();
        }

        public CreateHttpRequestCommand resetLineItemExternalTotals(CreateHttpRequestCommand method) {
            if (method instanceof ByProjectKeyCartsByIDPost) {
                final ByProjectKeyCartsByIDPost byProjectKeyCartsByIDPost = (ByProjectKeyCartsByIDPost) method;
                final CartUpdate cartUpdate = byProjectKeyCartsByIDPost.getBody();
                if (cartUpdate instanceof WithCartCartUpdateImpl) {
                    final WithCartCartUpdateImpl withCartCartUpdate = (WithCartCartUpdateImpl) cartUpdate;
                    final Cart cart = withCartCartUpdate.getCart();

                    // do sth with the cart
                }
            }

            return method;
        }
    }
}
