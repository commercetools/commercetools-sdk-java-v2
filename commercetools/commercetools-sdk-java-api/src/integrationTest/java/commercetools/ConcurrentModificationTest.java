
package commercetools;

import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.client.RetryHandler;
import com.commercetools.api.client.error.ConcurrentModificationException;
import com.commercetools.api.defaultconfig.ApiRootBuilder;
import com.commercetools.api.defaultconfig.ServiceRegion;
import com.commercetools.api.models.cart.Cart;
import com.commercetools.api.models.cart.CartSetCountryActionBuilder;
import com.commercetools.api.models.cart.CartUpdate;
import com.commercetools.api.models.cart.CartUpdateBuilder;
import com.commercetools.api.models.product_type.ProductType;
import commercetools.cart.CartsFixtures;
import commercetools.product_type.ProductTypeFixtures;
import commercetools.utils.CommercetoolsTestUtils;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.http.ErrorMiddleware;
import io.vrap.rmf.base.client.http.InternalLogger;
import io.vrap.rmf.base.client.http.InternalLoggerMiddleware;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.event.Level;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.AppenderBase;

public class ConcurrentModificationTest {
    @Test
    public void concurrentMod() {
        ServiceRegion region = System.getenv("CTP_REGION") == null ? ServiceRegion.GCP_EUROPE_WEST1
                : ServiceRegion.valueOf(System.getenv("CTP_REGION"));
        String authURL = System.getenv("CTP_AUTH_URL") == null ? region.getOAuthTokenUrl()
                : System.getenv("CTP_AUTH_URL");
        String apiUrl = System.getenv("CTP_API_URL") == null ? region.getApiUrl() : System.getenv("CTP_API_URL");

        final ProjectApiRoot projectApiRoot = ApiRootBuilder.of()
                .defaultClient(ClientCredentials.of()
                        .withClientId(CommercetoolsTestUtils.getClientId())
                        .withClientSecret(CommercetoolsTestUtils.getClientSecret())
                        .build(),
                    authURL, apiUrl)
                .withErrorMiddleware(ErrorMiddleware.ExceptionMode.UNWRAP_COMPLETION_EXCEPTION)
                .build(CommercetoolsTestUtils.getProjectKey());

        CartsFixtures.withUpdateableCart(cart -> {

            final ApiHttpResponse<Cart> deCart = projectApiRoot.carts()
                    .withId(cart.getId())
                    .post(CartUpdateBuilder.of()
                            .version(cart.getVersion())
                            .actions(CartSetCountryActionBuilder.of().country("DE").build())
                            .build())
                    .executeBlocking();

            final Cart modCart = RetryHandler
                    .concurrentModification(projectApiRoot.carts()
                            .withId(cart.getId())
                            .post(CartUpdateBuilder.of()
                                    .version(cart.getVersion())
                                    .actions(CartSetCountryActionBuilder.of().country("DE").build())
                                    .build()),
                        CartUpdate::builder, CartUpdateBuilder::version)
                    .executeBlocking()
                    .getBody();
            return modCart;
        });
    }

    @Test
    public void concurrentModWithoutRetry() {
        ServiceRegion region = System.getenv("CTP_REGION") == null ? ServiceRegion.GCP_EUROPE_WEST1
                : ServiceRegion.valueOf(System.getenv("CTP_REGION"));
        String authURL = System.getenv("CTP_AUTH_URL") == null ? region.getOAuthTokenUrl()
                : System.getenv("CTP_AUTH_URL");
        String apiUrl = System.getenv("CTP_API_URL") == null ? region.getApiUrl() : System.getenv("CTP_API_URL");

        final ProjectApiRoot projectApiRoot = ApiRootBuilder.of()
                .defaultClient(ClientCredentials.of()
                        .withClientId(CommercetoolsTestUtils.getClientId())
                        .withClientSecret(CommercetoolsTestUtils.getClientSecret())
                        .build(),
                    authURL, apiUrl)
                .withErrorMiddleware(ErrorMiddleware.ExceptionMode.UNWRAP_COMPLETION_EXCEPTION)
                .build(CommercetoolsTestUtils.getProjectKey());

        CartsFixtures.withUpdateableCart(cart -> {

            final Cart modCart = RetryHandler
                    .concurrentModification(projectApiRoot.carts()
                            .withId(cart.getId())
                            .post(CartUpdateBuilder.of()
                                    .version(cart.getVersion())
                                    .actions(CartSetCountryActionBuilder.of().country("DE").build())
                                    .build()),
                        CartUpdate::builder, CartUpdateBuilder::version)
                    .executeBlocking()
                    .getBody();
            return modCart;
        });
    }

    @Test
    public void concurrentModDelete() {
        ServiceRegion region = System.getenv("CTP_REGION") == null ? ServiceRegion.GCP_EUROPE_WEST1
                : ServiceRegion.valueOf(System.getenv("CTP_REGION"));
        String authURL = System.getenv("CTP_AUTH_URL") == null ? region.getOAuthTokenUrl()
                : System.getenv("CTP_AUTH_URL");
        String apiUrl = System.getenv("CTP_API_URL") == null ? region.getApiUrl() : System.getenv("CTP_API_URL");

        final ProjectApiRoot projectApiRoot = ApiRootBuilder.of()
                .defaultClient(ClientCredentials.of()
                        .withClientId(CommercetoolsTestUtils.getClientId())
                        .withClientSecret(CommercetoolsTestUtils.getClientSecret())
                        .build(),
                    authURL, apiUrl)
                .withErrorMiddleware(ErrorMiddleware.ExceptionMode.UNWRAP_COMPLETION_EXCEPTION)
                .build(CommercetoolsTestUtils.getProjectKey());

        ProductTypeFixtures.withUpdateableProductType(productType -> {

            final ApiHttpResponse<ProductType> response = projectApiRoot.productTypes()
                    .update(productType,
                        builder -> builder.plus(
                            actionBuilder -> actionBuilder.changeDescriptionBuilder().description("new description")))
                    .executeBlocking();

            final ProductType deletedProductType = RetryHandler
                    .concurrentModification(projectApiRoot.productTypes().delete(productType))
                    .executeBlocking()
                    .getBody();
            return deletedProductType;
        });
    }

    @Test
    public void concurrentModDeleteWithoutRetry() {
        ServiceRegion region = System.getenv("CTP_REGION") == null ? ServiceRegion.GCP_EUROPE_WEST1
                : ServiceRegion.valueOf(System.getenv("CTP_REGION"));
        String authURL = System.getenv("CTP_AUTH_URL") == null ? region.getOAuthTokenUrl()
                : System.getenv("CTP_AUTH_URL");
        String apiUrl = System.getenv("CTP_API_URL") == null ? region.getApiUrl() : System.getenv("CTP_API_URL");

        final ProjectApiRoot projectApiRoot = ApiRootBuilder.of()
                .defaultClient(ClientCredentials.of()
                        .withClientId(CommercetoolsTestUtils.getClientId())
                        .withClientSecret(CommercetoolsTestUtils.getClientSecret())
                        .build(),
                    authURL, apiUrl)
                .withErrorMiddleware(ErrorMiddleware.ExceptionMode.UNWRAP_COMPLETION_EXCEPTION)
                .build(CommercetoolsTestUtils.getProjectKey());

        ProductTypeFixtures.withUpdateableProductType(productType -> {

            //            final ApiHttpResponse<ProductType> response = projectApiRoot.productTypes()
            //                    .update(productType,
            //                            builder -> builder.plus(
            //                                    actionBuilder -> actionBuilder.changeDescriptionBuilder().description("new description")))
            //                    .executeBlocking();

            final ProductType deletedProductType = RetryHandler
                    .concurrentModification(projectApiRoot.productTypes().delete(productType))
                    .executeBlocking()
                    .getBody();
            return deletedProductType;
        });
    }

    @Test
    public void concurrentModMiddleware() {
        String projectKey = CommercetoolsTestUtils.getProjectKey();

        ProjectApiRoot projectApiRoot = ApiRootBuilder.of()
                .defaultClient(ClientCredentials.of()
                        .withClientId(CommercetoolsTestUtils.getClientId())
                        .withClientSecret(CommercetoolsTestUtils.getClientSecret())
                        .build(),
                    ServiceRegion.GCP_EUROPE_WEST1)
                .addConcurrentModificationMiddleware(3)
                .build(projectKey);

        CartsFixtures.withUpdateableCart(cart -> {

            final ApiHttpResponse<Cart> deCart = projectApiRoot.carts()
                    .withId(cart.getId())
                    .post(CartUpdateBuilder.of()
                            .version(cart.getVersion())
                            .actions(CartSetCountryActionBuilder.of().country("DE").build())
                            .build())
                    .executeBlocking();

            final Cart modCart = projectApiRoot.carts()
                    .withId(cart.getId())
                    .post(CartUpdateBuilder.of()
                            .version(cart.getVersion())
                            .actions(CartSetCountryActionBuilder.of().country("DE").build())
                            .build())
                    .executeBlocking()
                    .getBody();
            return modCart;
        });
    }

    @Test
    public void testInfoLoggerException() {

        TestLogAppender testLogAppender = new TestLogAppender();
        ch.qos.logback.classic.Logger logger = (ch.qos.logback.classic.Logger) LoggerFactory
                .getLogger(Logger.ROOT_LOGGER_NAME);
        logger.setLevel(ch.qos.logback.classic.Level.INFO);
        logger.addAppender(testLogAppender);
        testLogAppender.start();

        final InternalLoggerMiddleware loggerMiddleware = InternalLoggerMiddleware
                .of((request, topic) -> new TestLogger(logger));

        ApiHttpRequest request = new ApiHttpRequest(ApiHttpMethod.GET, URI.create("https://api.commercetools.com/"),
            new ApiHttpHeaders(), null);
        CompletableFuture<ApiHttpResponse<byte[]>> f = new CompletableFuture<>();
        ApiHttpResponse<byte[]> response = new ApiHttpResponse<>(409, new ApiHttpHeaders(),
            "{\"errors\": []}".getBytes(StandardCharsets.UTF_8));
        f.completeExceptionally(new CompletionException(new ConcurrentModificationException(response.getStatusCode(),
            response.getBodyAsString().orElse(""), response.getHeaders(), response.getMessage(), response)));
        loggerMiddleware.invoke(request, apiHttpRequest -> f);

        Assertions.assertThat(testLogAppender.loggingEvents)
                .anyMatch(iLoggingEvent -> iLoggingEvent.getFormattedMessage()
                        .matches("GET https://api.commercetools.com/ 409 \\d+ - -")
                        && iLoggingEvent.getLevel().toString().equals(Level.INFO.toString()));
        testLogAppender.stop();
    }

    @Test
    public void testDebugLoggerException() {

        TestLogAppender testLogAppender = new TestLogAppender();
        ch.qos.logback.classic.Logger logger = (ch.qos.logback.classic.Logger) LoggerFactory
                .getLogger(Logger.ROOT_LOGGER_NAME);
        logger.setLevel(ch.qos.logback.classic.Level.DEBUG);
        logger.addAppender(testLogAppender);
        testLogAppender.start();

        final InternalLoggerMiddleware loggerMiddleware = InternalLoggerMiddleware.of(
            (request, topic) -> new TestLogger(logger), Level.INFO, Level.INFO, Level.ERROR,
            Collections.singletonMap(io.vrap.rmf.base.client.error.ConcurrentModificationException.class, Level.DEBUG));

        ApiHttpRequest request = new ApiHttpRequest(ApiHttpMethod.GET, URI.create("https://api.commercetools.com/"),
            new ApiHttpHeaders(), null);
        CompletableFuture<ApiHttpResponse<byte[]>> f = new CompletableFuture<>();
        ApiHttpResponse<byte[]> response = new ApiHttpResponse<>(409, new ApiHttpHeaders(),
            "{\"errors\": []}".getBytes(StandardCharsets.UTF_8));
        f.completeExceptionally(new CompletionException(new ConcurrentModificationException(response.getStatusCode(),
            response.getBodyAsString().orElse(""), response.getHeaders(), response.getMessage(), response)));
        loggerMiddleware.invoke(request, apiHttpRequest -> f);

        Assertions.assertThat(testLogAppender.loggingEvents)
                .anyMatch(iLoggingEvent -> iLoggingEvent.getFormattedMessage()
                        .matches("GET https://api.commercetools.com/ 409 \\d+ - -")
                        && iLoggingEvent.getLevel().toString().equals(Level.DEBUG.toString()));

        testLogAppender.stop();
    }

    static class TestLogAppender extends AppenderBase<ILoggingEvent> {
        ArrayList<ILoggingEvent> loggingEvents = new ArrayList<>();

        @Override
        protected void append(ILoggingEvent eventObject) {
            loggingEvents.add(eventObject);
        }

        ILoggingEvent getLastLoggedEvent() {
            if (loggingEvents.isEmpty())
                return null;

            return loggingEvents.get(loggingEvents.size() - 1);

        }
    }

    static class TestLogger extends InternalLogger {
        public TestLogger(Logger underlyingLogger) {
            super(underlyingLogger);
        }
    }
}
