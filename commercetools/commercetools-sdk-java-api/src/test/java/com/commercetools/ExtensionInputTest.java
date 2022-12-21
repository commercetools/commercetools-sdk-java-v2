
package com.commercetools;

import static com.commercetools.TestUtils.stringFromResource;

import com.commercetools.api.models.cart.Cart;
import com.commercetools.api.models.cart.CartReference;
import com.commercetools.api.models.cart.CartUpdate;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.ErrorResponse;
import com.commercetools.api.models.extension.ExtensionAction;
import com.commercetools.api.models.extension.ExtensionInput;
import com.fasterxml.jackson.core.JsonProcessingException;

import io.vrap.rmf.base.client.utils.json.JsonUtils;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExtensionInputTest {
    @Test
    public void deserialize() throws JsonProcessingException {
        ExtensionInput input = JsonUtils.fromJsonString(stringFromResource("extension-input.json"),
            ExtensionInput.class);

        Assertions.assertThat(input.getAction()).isEqualTo(ExtensionAction.CREATE);
        Assertions.assertThat(input.getResource()).isInstanceOf(CartReference.class);
        Assertions.assertThat(((CartReference) input.getResource()).getObj()).isInstanceOf(Cart.class);

        ErrorResponse response = ErrorResponse.builder()
                .plusErrors(ErrorObject.invalidInputBuilder()
                        .message("You can not put more than 10 items into the cart.")
                        .buildUnchecked())
                .buildUnchecked();

        String errorResponse = JsonUtils.toJsonString(response);

        Assertions.assertThat(errorResponse).isNotBlank();

        CartUpdate update = CartUpdate.builder()
                .plusActions(builder -> builder.addCustomLineItemBuilder()
                        .money(Money.builder().centAmount(1000L).currencyCode("EUR").build())
                        .slug("mandatory-insurance")
                        .quantity(1L)
                        .name(LocalizedString.ofEnglish("Mandatory Insurance for Items above $500"))
                        .taxCategory(taxBuilder -> taxBuilder.id("1235")))
                .buildUnchecked();

        String updateResponse = JsonUtils.toJsonString(update);

        Assertions.assertThat(updateResponse).isNotBlank();
    }
}
