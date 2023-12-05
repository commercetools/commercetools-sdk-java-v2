
package com.commercetools.api.models.cart;

import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class CartSetAnonymousIdActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CartSetAnonymousIdActionBuilder builder) {
        CartSetAnonymousIdAction cartSetAnonymousIdAction = builder.buildUnchecked();
        Assertions.assertThat(cartSetAnonymousIdAction).isInstanceOf(CartSetAnonymousIdAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CartSetAnonymousIdAction.builder().anonymousId("anonymousId") } };
    }

    @Test
    public void anonymousId() {
        CartSetAnonymousIdAction value = CartSetAnonymousIdAction.of();
        value.setAnonymousId("anonymousId");
        Assertions.assertThat(value.getAnonymousId()).isEqualTo("anonymousId");
    }
}
