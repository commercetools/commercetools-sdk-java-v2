
package commercetools;

import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;
import java.util.function.Function;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.client.error.ConcurrentModificationException;
import com.commercetools.api.models.ResourceUpdate;
import com.commercetools.api.models.cart.Cart;
import com.commercetools.api.models.cart.CartSetCountryActionBuilder;
import com.commercetools.api.models.cart.CartUpdate;
import com.commercetools.api.models.cart.CartUpdateBuilder;
import commercetools.cart.CartsFixtures;
import commercetools.utils.CommercetoolsTestUtils;

import io.vrap.rmf.base.client.ApiHttpResponse;
import io.vrap.rmf.base.client.BodyApiMethod;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.ClientUtils;

import org.junit.jupiter.api.Test;

public class ConcurrentModificationTest {
    @Test
    public void concurrentMod() {
        final ProjectApiRoot projectApiRoot = CommercetoolsTestUtils.getProjectApiRoot();
        CartsFixtures.withUpdateableCart(cart -> {

            final ApiHttpResponse<Cart> deCart = projectApiRoot.carts()
                    .withId(cart.getId())
                    .post(CartUpdateBuilder.of()
                            .version(cart.getVersion())
                            .actions(CartSetCountryActionBuilder.of().country("DE").build())
                            .build())
                    .executeBlocking();

            final CompletableFuture<ApiHttpResponse<Cart>> modCartFuture = Retry.of(projectApiRoot.carts()
                    .withId(cart.getId())
                    .post(CartUpdateBuilder.of()
                            .version(cart.getVersion())
                            .actions(CartSetCountryActionBuilder.of().country("DE").build())
                            .build()),
                CartUpdate::builder, CartUpdateBuilder::version).execute();
            final Cart modCart = ClientUtils.blockingWait(modCartFuture, Duration.ofSeconds(10)).getBody();
            return modCart;
        });
    }

    public static class Retry<T extends BodyApiMethod<T, TResult, TBody>, TResult, TBody extends ResourceUpdate<TBody, ?, TBuilder>, TBuilder extends Builder<TBody>> {
        private final T request;
        private final Function<TBody, TBuilder> builderCopyFn;
        private final BiFunction<TBuilder, Long, TBuilder> updateFn;

        public Retry(T request, Function<TBody, TBuilder> builderCopyFn,
                BiFunction<TBuilder, Long, TBuilder> updateFn) {
            this.request = request;
            this.builderCopyFn = builderCopyFn;
            this.updateFn = updateFn;
        }

        public static <T extends BodyApiMethod<T, TResult, TBody>, TResult, TBody extends ResourceUpdate<TBody, ?, TBuilder>, TBuilder extends Builder<TBody>> Retry<T, TResult, TBody, TBuilder> of(
                T request, Function<TBody, TBuilder> builderCopyFn, BiFunction<TBuilder, Long, TBuilder> updateFn) {
            return new Retry<>(request, builderCopyFn, updateFn);
        }

        @SuppressWarnings("unchecked")
        public CompletableFuture<ApiHttpResponse<TResult>> execute() {
            Function<Throwable, CompletableFuture<ApiHttpResponse<TResult>>> fn = (throwable) -> {
                if (throwable.getCause() instanceof ConcurrentModificationException) {
                    final TBuilder body1 = updateFn.apply(builderCopyFn.apply(request.getBody()),
                        ((ConcurrentModificationException) throwable.getCause()).getCurrentVersion());
                    return request.withBody(body1.build()).execute();
                }

                CompletableFuture<ApiHttpResponse<TResult>> f = new CompletableFuture<>();
                f.completeExceptionally(throwable);
                return f;
            };

            return request.execute()
                    .handle((r, ex) -> (ex == null) ? this : fn.apply(ex))
                    .thenCompose(x -> (CompletableFuture<ApiHttpResponse<TResult>>) x);
        }
    }
}
