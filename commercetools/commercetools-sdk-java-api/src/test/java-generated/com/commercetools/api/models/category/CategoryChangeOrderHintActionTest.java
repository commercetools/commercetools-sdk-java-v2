
package com.commercetools.api.models.category;

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
public class CategoryChangeOrderHintActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CategoryChangeOrderHintActionBuilder builder) {
        CategoryChangeOrderHintAction categoryChangeOrderHintAction = builder.buildUnchecked();
        Assertions.assertThat(categoryChangeOrderHintAction).isInstanceOf(CategoryChangeOrderHintAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CategoryChangeOrderHintAction.builder().orderHint("orderHint") } };
    }

    @Test
    public void orderHint() {
        CategoryChangeOrderHintAction value = CategoryChangeOrderHintAction.of();
        value.setOrderHint("orderHint");
        Assertions.assertThat(value.getOrderHint()).isEqualTo("orderHint");
    }
}
