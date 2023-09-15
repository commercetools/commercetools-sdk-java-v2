
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
public class MyShoppingListSetCustomFieldActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MyShoppingListSetCustomFieldActionBuilder builder) {
        MyShoppingListSetCustomFieldAction myShoppingListSetCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(myShoppingListSetCustomFieldAction)
                .isInstanceOf(MyShoppingListSetCustomFieldAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { MyShoppingListSetCustomFieldAction.builder().name("name") },
                new Object[] { MyShoppingListSetCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void name() {
        MyShoppingListSetCustomFieldAction value = MyShoppingListSetCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        MyShoppingListSetCustomFieldAction value = MyShoppingListSetCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
