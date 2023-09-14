
package commercetools.product_projection;

import static commercetools.product.ProductFixtures.*;
import static commercetools.utils.CommercetoolsTestUtils.assertEventually;

import java.time.Duration;
import java.util.List;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.models.product.*;
import com.commercetools.api.models.product_type.AttributePlainEnumValue;
import commercetools.utils.CommercetoolsTestUtils;

import org.assertj.core.api.Assertions;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;

public class ProductProjectionIntegrationTests {

    @Test
    public void getById() {
        withProduct(product -> {
            ProductProjection productProjection = CommercetoolsTestUtils.getProjectApiRoot()
                    .productProjections()
                    .withId(product.getId())
                    .get()
                    .withStaged(true)
                    .executeBlocking()
                    .getBody();

            Assertions.assertThat(productProjection.getId()).isEqualTo(product.getId());
        });
    }

    @Test
    public void getByKey() {
        withProduct(product -> {
            ProductProjection productProjection = CommercetoolsTestUtils.getProjectApiRoot()
                    .productProjections()
                    .withKey(product.getKey())
                    .get()
                    .withStaged(true)
                    .executeBlocking()
                    .getBody();

            Assertions.assertThat(productProjection.getKey()).isEqualTo(product.getKey());
        });
    }

    @Test
    public void query() {
        withProduct(product -> {
            ProductProjectionPagedQueryResponse productProjectionPagedQueryResponse = CommercetoolsTestUtils
                    .getProjectApiRoot()
                    .productProjections()
                    .get()
                    .withStaged(true)
                    .withWhere("id=" + "\"" + product.getId() + "\"")
                    .executeBlocking()
                    .getBody();

            Assertions.assertThat(productProjectionPagedQueryResponse.getResults().get(0).getId())
                    .isEqualTo(product.getId());
        });
    }

    @Test
    public void search() {
        withProduct(product -> {
            ProductProjectionPagedSearchResponse searchResponse = CommercetoolsTestUtils.getProjectApiRoot()
                    .productProjections()
                    .search()
                    .get()
                    .withFacet("categories.id")
                    .withStaged(true)
                    .executeBlocking()
                    .getBody();

            Assertions.assertThat(searchResponse.getFacets().values().get("categories.id"))
                    .isInstanceOf(TermFacetResult.class);
        });
    }

    @Test
    public void searchBoolean() {
        ProjectApiRoot apiRoot = CommercetoolsTestUtils.getProjectApiRoot();
        withProduct(product1 -> {
            withProduct(product2 -> {
                withUpdateableProduct(product3 -> {
                    List<String> categories = Lists.list(
                        product1.getMasterData().getCurrent().getCategories().get(0).getId(),
                        product2.getMasterData().getCurrent().getCategories().get(0).getId(),
                        product3.getMasterData().getCurrent().getCategories().get(0).getId());
                    assertEventually(Duration.ofSeconds(60), Duration.ofMillis(500), () -> {
                        ProductProjectionPagedSearchResponse searchResponse = apiRoot.productProjections()
                                .search()
                                .get()
                                .withFilter("variants.attributes.testboolean:true")
                                .addFilter("categories.id:\"" + String.join("\",\"", categories) + "\"")
                                .withStaged(true)
                                .executeBlocking()
                                .getBody();
                        Assertions.assertThat(searchResponse.getCount()).isEqualTo(3);

                    });
                    Product p = apiRoot.products()
                            .update(product3)
                            .with(
                                b -> b.plus(a -> a.setAttributeInAllVariantsBuilder().name("testboolean").value(false)))
                            .executeBlocking()
                            .getBody();

                    assertEventually(Duration.ofSeconds(60), Duration.ofMillis(500), () -> {
                        ProductProjectionPagedSearchResponse searchResponse = apiRoot.productProjections()
                                .search()
                                .get()
                                .withFilter("variants.attributes.testboolean:true")
                                .addFilter("categories.id:\"" + String.join("\",\"", categories) + "\"")
                                .withStaged(true)
                                .executeBlocking()
                                .getBody();
                        Assertions.assertThat(searchResponse.getCount()).isEqualTo(2);
                        Assertions.assertThat(searchResponse.getResults().stream().map(ProductProjection::getId))
                                .doesNotContain(product3.getId());
                    });
                    return p;
                });
            });
        });
    }

    @Test
    public void attribute() {
        withProduct(product -> {
            ProductProjection productProjection = CommercetoolsTestUtils.getProjectApiRoot()
                    .productProjections()
                    .withKey(product.getKey())
                    .get()
                    .withStaged(true)
                    .executeBlocking()
                    .getBody();

            Assertions
                    .assertThat(productProjection.getMasterVariant()
                            .getAttributes()
                            .stream()
                            .filter(attribute -> attribute.getName().equals("test-text"))
                            .findFirst()
                            .get()
                            .getValue())
                    .isEqualTo("foo");
            Assertions
                    .assertThat(productProjection.getMasterVariant()
                            .getAttributes()
                            .stream()
                            .filter(attribute -> attribute.getName().equals("test-number"))
                            .findFirst()
                            .get()
                            .getValue())
                    .isEqualTo(10.0);
            Assertions
                    .assertThat(productProjection.getMasterVariant()
                            .getAttributes()
                            .stream()
                            .filter(attribute -> attribute.getName().equals("test-integer"))
                            .findFirst()
                            .get()
                            .getValue())
                    .isEqualTo(10L);
            Assertions
                    .assertThat(productProjection.getMasterVariant()
                            .getAttributes()
                            .stream()
                            .filter(attribute -> attribute.getName().equals("test-set-text"))
                            .findFirst()
                            .get()
                            .getValue())
                    .asList()
                    .contains("foo");
            Assertions
                    .assertThat(productProjection.getMasterVariant()
                            .getAttributes()
                            .stream()
                            .filter(attribute -> attribute.getName().equals("test-set-number"))
                            .findFirst()
                            .get()
                            .getValue())
                    .asList()
                    .contains(11.0);
            Assertions
                    .assertThat(productProjection.getMasterVariant()
                            .getAttributes()
                            .stream()
                            .filter(attribute -> attribute.getName().equals("test-set-integer"))
                            .findFirst()
                            .get()
                            .getValue())
                    .asList()
                    .contains(11L);
            Assertions
                    .assertThat(productProjection.getMasterVariant()
                            .getAttributes()
                            .stream()
                            .filter(attribute -> attribute.getName().equals("test-enum"))
                            .findFirst()
                            .get()
                            .getValue())
                    .isInstanceOf(AttributePlainEnumValue.class);
        });
    }
}
