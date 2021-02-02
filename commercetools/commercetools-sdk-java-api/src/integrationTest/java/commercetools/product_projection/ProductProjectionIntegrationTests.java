
package commercetools.product_projection;

import com.commercetools.api.models.product.ProductProjection;
import com.commercetools.api.models.product.ProductProjectionPagedQueryResponse;
import com.commercetools.api.models.product.ProductProjectionPagedSearchResponse;
import com.commercetools.api.models.product.TermFacetResult;
import com.commercetools.api.models.product_type.AttributePlainEnumValue;
import commercetools.product.ProductFixtures;
import commercetools.utils.CommercetoolsTestUtils;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;

public class ProductProjectionIntegrationTests {

    @Test
    public void getById() {
        ProductFixtures.withProduct(product -> {
            ProductProjection productProjection = CommercetoolsTestUtils.getProjectRoot().productProjections().withId(
                product.getId()).get().withStaged(true).executeBlocking().getBody();

            Assert.assertEquals(productProjection.getId(), product.getId());
        });
    }

    @Test
    public void getByKey() {
        ProductFixtures.withProduct(product -> {
            ProductProjection productProjection = CommercetoolsTestUtils.getProjectRoot().productProjections().withKey(
                product.getKey()).get().withStaged(true).executeBlocking().getBody();

            Assert.assertEquals(productProjection.getKey(), product.getKey());
        });
    }

    @Test
    public void query() {
        ProductFixtures.withProduct(product -> {
            ProductProjectionPagedQueryResponse productProjectionPagedQueryResponse = CommercetoolsTestUtils.getProjectRoot().productProjections().get().withStaged(
                true).withWhere("id=" + "\"" + product.getId() + "\"").executeBlocking().getBody();

            Assert.assertEquals(productProjectionPagedQueryResponse.getResults().get(0).getId(), product.getId());
        });
    }

    @Test
    public void search() {
        ProductFixtures.withProduct(product -> {
            ProductProjectionPagedSearchResponse searchResponse = CommercetoolsTestUtils.getProjectRoot().productProjections().search().get().withFacet(
                "categories.id").withStaged(true).executeBlocking().getBody();

            Assertions.assertThat(searchResponse.getFacets().values().get("categories.id")).isInstanceOf(
                TermFacetResult.class);
        });
    }

    @Test
    public void attribute() {
        ProductFixtures.withProduct(product -> {
            ProductProjection productProjection = CommercetoolsTestUtils.getProjectRoot().productProjections().withKey(
                product.getKey()).get().withStaged(true).executeBlocking().getBody();

            Assertions.assertThat(productProjection.getMasterVariant().getAttributes().stream().filter(
                attribute -> attribute.getName().equals("test-text")).findFirst().get().getValue()).isEqualTo("foo");
            Assertions.assertThat(productProjection.getMasterVariant().getAttributes().stream().filter(
                attribute -> attribute.getName().equals("test-number")).findFirst().get().getValue()).isEqualTo(10.0);
            Assertions.assertThat(productProjection.getMasterVariant().getAttributes().stream().filter(
                attribute -> attribute.getName().equals(
                    "test-set-text")).findFirst().get().getValue()).asList().contains("foo");
            Assertions.assertThat(productProjection.getMasterVariant().getAttributes().stream().filter(
                attribute -> attribute.getName().equals(
                    "test-set-number")).findFirst().get().getValue()).asList().contains(11.0);
            Assertions.assertThat(productProjection.getMasterVariant().getAttributes().stream().filter(
                attribute -> attribute.getName().equals("test-enum")).findFirst().get().getValue()).isInstanceOf(
                    AttributePlainEnumValue.class);
        });
    }
}
