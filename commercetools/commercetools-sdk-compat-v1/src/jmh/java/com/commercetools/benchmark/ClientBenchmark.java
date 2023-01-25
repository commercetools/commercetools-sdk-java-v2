
package com.commercetools.benchmark;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.commercetools.api.client.ApiInternalLoggerFactory;
import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.defaultconfig.ApiRootBuilder;
import com.commercetools.api.defaultconfig.ServiceRegion;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.product.Product;
import com.commercetools.api.models.product.ProductProjectionPagedQueryResponse;
import com.commercetools.api.models.product_type.AttributeTypeBuilder;
import com.commercetools.api.models.product_type.ProductType;
import com.commercetools.api.models.tax_category.TaxCategory;
import com.commercetools.compat.CompatSphereClient;
import com.commercetools.http.apachehttp.CtApacheHttpClient;
import com.commercetools.http.asynchttp.CtAsyncHttpClient;
import com.commercetools.http.okhttp4.CtOkHttp4Client;

import io.sphere.sdk.client.BlockingSphereClient;
import io.sphere.sdk.client.SphereAsyncHttpClientFactory;
import io.sphere.sdk.client.SphereClient;
import io.sphere.sdk.client.SphereClientFactory;
import io.sphere.sdk.products.ProductProjection;
import io.sphere.sdk.products.queries.ProductProjectionQuery;
import io.sphere.sdk.projects.queries.ProjectGet;
import io.sphere.sdk.queries.PagedQueryResult;
import io.vrap.rmf.base.client.ApiHttpResponse;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;

import org.assertj.core.api.Assertions;
import org.openjdk.jmh.annotations.*;

public class ClientBenchmark {
    @State(Scope.Benchmark)
    public static class ClientState {
        private ProjectApiRoot ahcApiRoot;

        private ProjectApiRoot apacheApiRoot;

        private ProjectApiRoot okhttpApiRoot;

        private BlockingSphereClient sphereClient;

        private BlockingSphereClient compatClient;

        private BlockingSphereClient compatOkHttpClient;

        private List<Product> productsList;

        private TaxCategory taxCategory;

        private ProductType productType;

        @Setup(Level.Trial)
        public void init() {
            ahcApiRoot = ApiRootBuilder.of(new CtAsyncHttpClient())
                    .defaultClient(
                        ClientCredentials.of().withClientId(getClientId()).withClientSecret(getClientSecret()).build(),
                        ServiceRegion.GCP_EUROPE_WEST1)
                    .withInternalLoggerFactory(ApiInternalLoggerFactory::get, org.slf4j.event.Level.DEBUG,
                        org.slf4j.event.Level.DEBUG)
                    .build(getProjectKey());

            apacheApiRoot = ApiRootBuilder.of(new CtApacheHttpClient())
                    .defaultClient(
                        ClientCredentials.of().withClientId(getClientId()).withClientSecret(getClientSecret()).build(),
                        ServiceRegion.GCP_EUROPE_WEST1)
                    .withInternalLoggerFactory(ApiInternalLoggerFactory::get, org.slf4j.event.Level.DEBUG,
                        org.slf4j.event.Level.DEBUG)
                    .build(getProjectKey());

            okhttpApiRoot = ApiRootBuilder.of(new CtOkHttp4Client())
                    .defaultClient(
                        ClientCredentials.of().withClientId(getClientId()).withClientSecret(getClientSecret()).build(),
                        ServiceRegion.GCP_EUROPE_WEST1)
                    .withInternalLoggerFactory(ApiInternalLoggerFactory::get, org.slf4j.event.Level.DEBUG,
                        org.slf4j.event.Level.DEBUG)
                    .build(getProjectKey());

            final SphereClientFactory factory = SphereClientFactory.of(SphereAsyncHttpClientFactory::create);
            final SphereClient client = factory.createClient(getProjectKey(), //replace with your project key
                getClientId(), //replace with your client id
                getClientSecret()); //replace with your client secret

            sphereClient = BlockingSphereClient.of(client, Duration.ofSeconds(10));

            compatClient = BlockingSphereClient.of(CompatSphereClient.of(ahcApiRoot), Duration.ofSeconds(10));

            compatOkHttpClient = BlockingSphereClient.of(CompatSphereClient.of(okhttpApiRoot), Duration.ofSeconds(10));

            productType = createProductType();

            taxCategory = createTaxCategory();
            productsList = createProducts(taxCategory, productType);
        }

        @TearDown(Level.Trial)
        public void tearDown() {
            deleteProducts(productsList);
            deleteProductType(productType);
            deleteTaxCategory(taxCategory);
            ahcApiRoot.close();
            compatClient.close();
            compatOkHttpClient.close();
            apacheApiRoot.close();
            okhttpApiRoot.close();
            sphereClient.close();
        }

        public ProductType createProductType() {
            String suffix = randomKey();
            return ahcApiRoot.productTypes()
                    .create(builder -> builder.key("benchmark-" + suffix)
                            .name("benchmark")
                            .description("benchmark")
                            .plusAttributes(attributeBuilder -> attributeBuilder.type(AttributeTypeBuilder::textBuilder)
                                    .isRequired(false)
                                    .name("benchmark-color")
                                    .isSearchable(true)
                                    .label(LocalizedString.ofEnglish("color"))))
                    .executeBlocking()
                    .getBody();
        }

        private TaxCategory createTaxCategory() {
            String suffix = randomKey();
            return ahcApiRoot.taxCategories()
                    .create(builder -> builder.key("benchmark-" + suffix)
                            .name("benchmark-" + suffix)
                            .description("benchmark-" + suffix)
                            .plusRates(rateBuilder -> rateBuilder.name("Mwst")
                                    .country("DE")
                                    .amount(0.19)
                                    .includedInPrice(true)))
                    .executeBlocking()
                    .getBody();
        }

        private List<Product> createProducts(TaxCategory taxCategory, ProductType productType) {
            String productSuffix = randomKey();
            List<Product> products = new ArrayList<>();
            for (int i = 0; i < 150; i++) {
                String suffix = productSuffix + "-" + i;
                Product product = ahcApiRoot.products()
                        .create(
                            builder -> builder.key("benchmark-" + suffix)
                                    .productType(p -> p.id(productType.getId()))
                                    .taxCategory(t -> t.id(taxCategory.getId()))
                                    .name(LocalizedString.ofEnglish("benchmark-" + suffix))
                                    .slug(LocalizedString.ofEnglish("benchmark-" + suffix))
                                    .description(LocalizedString.ofEnglish("benchmark-" + suffix))
                                    .masterVariant(variantBuilder -> variantBuilder.key("benchmark-variant1-" + suffix)
                                            .sku("benchmark-variant1-" + suffix)
                                            .plusPrices(price -> price.country("DE")
                                                    .value(moneyBuilder -> moneyBuilder.centAmount(100L)
                                                            .currencyCode("EUR")))
                                            .plusAttributes(
                                                attribute -> attribute.name("benchmark-color").value("red" + suffix))))
                        .executeBlocking()
                        .getBody();
                products.add(product);
            }
            return products;
        }

        private void deleteProducts(List<Product> products) {
            products.forEach(product -> ahcApiRoot.products().delete(product).executeBlocking());
        }

        private void deleteProductType(ProductType productType) {
            ahcApiRoot.productTypes().delete(productType).executeBlocking();
        }

        private void deleteTaxCategory(TaxCategory taxCategory) {
            ahcApiRoot.taxCategories().delete(taxCategory).executeBlocking();
        }

        public static String randomKey() {
            return "random-key-" + UUID.randomUUID().toString();
        }
    }

    @Benchmark
    public void retrieveProjectV2_AHC(ClientState state) {
        state.ahcApiRoot.get().executeBlocking();
    }

    @Benchmark
    public void retrieveProjectV2_Apache(ClientState state) {
        state.apacheApiRoot.get().executeBlocking();
    }

    @Benchmark
    public void retrieveProjectV2_OkHttp(ClientState state) {
        state.okhttpApiRoot.get().executeBlocking();
    }

    @Benchmark
    public void retrieveProjectV1_AHC(ClientState state) {
        state.sphereClient.executeBlocking(ProjectGet.of());
    }

    @Benchmark
    public void retrieveProjectV2_Compat(ClientState state) {
        state.compatClient.executeBlocking(ProjectGet.of());
    }

    @Benchmark
    public void retrieveProjectV2_CompatOkHttp(ClientState state) {
        state.compatOkHttpClient.executeBlocking(ProjectGet.of());
    }

    @Benchmark
    public void retrieveProductsV2_CompatAHC(ClientState state) {
        final PagedQueryResult<ProductProjection> response = state.compatClient
                .executeBlocking(ProductProjectionQuery.ofStaged().withLimit(100));
        Assertions.assertThat(response.getCount()).isEqualTo(100);
    }

    @Benchmark
    public void retrieveProductsV2_CompatOkHttp(ClientState state) {
        final PagedQueryResult<ProductProjection> response = state.compatOkHttpClient
                .executeBlocking(ProductProjectionQuery.ofStaged().withLimit(100));
        Assertions.assertThat(response.getCount()).isEqualTo(100);
    }

    @Benchmark
    public void retrieveProductsV1_AHC(ClientState state) {
        final PagedQueryResult<ProductProjection> response = state.sphereClient
                .executeBlocking(ProductProjectionQuery.ofStaged().withLimit(100));
        Assertions.assertThat(response.getCount()).isEqualTo(100);
    }

    @Benchmark
    public void retrieveProductsV2_AHC(ClientState state) {
        final ApiHttpResponse<ProductProjectionPagedQueryResponse> response = state.ahcApiRoot.productProjections()
                .get()
                .withStaged(true)
                .withLimit(100)
                .executeBlocking();
        Assertions.assertThat(response.getBody().getCount()).isEqualTo(100);

    }

    @Benchmark
    public void retrieveProductsV2_OkHtp(ClientState state) {
        final ApiHttpResponse<ProductProjectionPagedQueryResponse> response = state.okhttpApiRoot.productProjections()
                .get()
                .withStaged(true)
                .withLimit(100)
                .executeBlocking();

        Assertions.assertThat(response.getBody().getCount()).isEqualTo(100);
    }

    public static String getProjectKey() {
        return System.getenv("CTP_PROJECT_KEY");
    }

    public static String getClientId() {
        return System.getenv("CTP_CLIENT_ID");
    }

    public static String getClientSecret() {
        return System.getenv("CTP_CLIENT_SECRET");
    }

}
