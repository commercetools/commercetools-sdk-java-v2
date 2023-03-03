
package commercetools.cart;

import static commercetools.cart.CartsFixtures.withUpdateableCart;
import static commercetools.type.TypeFixtures.withType;

import java.util.Collections;

import com.commercetools.api.models.cart.*;
import com.commercetools.api.models.type.*;
import commercetools.utils.CommercetoolsTestUtils;

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
}
