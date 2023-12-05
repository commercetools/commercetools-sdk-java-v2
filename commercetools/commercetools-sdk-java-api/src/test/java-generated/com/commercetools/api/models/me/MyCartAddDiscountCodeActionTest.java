
package com.commercetools.api.models.me;

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
public class MyCartAddDiscountCodeActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MyCartAddDiscountCodeActionBuilder builder) {
        MyCartAddDiscountCodeAction myCartAddDiscountCodeAction = builder.buildUnchecked();
        Assertions.assertThat(myCartAddDiscountCodeAction).isInstanceOf(MyCartAddDiscountCodeAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { MyCartAddDiscountCodeAction.builder().code("code") } };
    }

    @Test
    public void code() {
        MyCartAddDiscountCodeAction value = MyCartAddDiscountCodeAction.of();
        value.setCode("code");
        Assertions.assertThat(value.getCode()).isEqualTo("code");
    }
}
