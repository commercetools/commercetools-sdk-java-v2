
package commercetools.cart;

import static commercetools.cart.CartsFixtures.withUpdateableCart;
import static commercetools.type.TypeFixtures.withType;

import java.util.Collections;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.defaultconfig.ApiRootBuilder;
import com.commercetools.api.json.ApiModuleOptions;
import com.commercetools.api.models.cart.*;
import com.commercetools.api.models.type.*;
import commercetools.utils.CommercetoolsTestUtils;

import io.vrap.rmf.base.client.ResponseSerializer;
import io.vrap.rmf.base.client.utils.json.JsonUtils;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CartCustomFieldsTests {

    @Test
    public void updateCartWithCustomFields() {
        withType(type -> {
            withUpdateableCart(cart -> {
                final String FIELD_NAME = type.getFieldDefinitions()
                        .stream()
                        .filter(fieldDefinition -> fieldDefinition.getType()
                                .equals(CustomFieldStringTypeBuilder.of().build()))
                        .map(FieldDefinition::getName)
                        .findFirst()
                        .orElse(null);
                final String FIELD_VALUE = "field value";

                Cart updatedCart = CommercetoolsTestUtils.getProjectApiRoot()
                        .carts()
                        .update(cart)
                        .with(b -> b.plus(actionBuilder -> actionBuilder.setCustomTypeBuilder()
                                .type(type.toResourceIdentifier())
                                .fields(fieldsBuilder -> fieldsBuilder.addValue(FIELD_NAME, FIELD_VALUE))))
                        .executeBlocking()
                        .getBody();

                Assertions.assertThat(updatedCart.getCustom().getFields().values())
                        .isEqualTo(Collections.singletonMap(FIELD_NAME, FIELD_VALUE));

                return updatedCart;
            });
        });
    }

    // https://commercetools.atlassian.net/browse/SUPPORT-29551
    @Test
    public void fetchCartWithCustomFieldDateTime() {
        withType(type -> {
            withUpdateableCart(cart -> {
                ProjectApiRoot projectApiRoot = ApiRootBuilder.ofEnvironmentVariables()
                        .withSerializer(ResponseSerializer.of(JsonUtils.createObjectMapper(
                            ApiModuleOptions.of().withDateAttributeAsString(true).withDateCustomFieldAsString(true))))
                        .buildProjectRoot();

                Cart updatedCart = projectApiRoot.carts()
                        .update(cart)
                        .with(b -> b.plus(actionBuilder -> actionBuilder.setCustomTypeBuilder()
                                .type(type.toResourceIdentifier())
                                .fields(fieldBuilder -> fieldBuilder.addValue("ttl", "2024-11-11T03:55:48.970653Z"))))
                        .executeBlocking()
                        .getBody();

                Assertions.assertThat(updatedCart.getCustom().getFields().values())
                        .isEqualTo(Collections.singletonMap("ttl", "2024-11-11T03:55:48.970653Z"));

                Cart fetchedCart = projectApiRoot.carts().withId(cart.getId()).get().executeBlocking().getBody();
                Assertions.assertThat(fetchedCart.getCustom().getFields().values())
                        .isEqualTo(Collections.singletonMap("ttl", "2024-11-11T03:55:48.970653Z"));

                return updatedCart;
            });
        });
    }
}
