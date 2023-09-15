
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
public class MyQuoteChangeMyQuoteStateActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MyQuoteChangeMyQuoteStateActionBuilder builder) {
        MyQuoteChangeMyQuoteStateAction myQuoteChangeMyQuoteStateAction = builder.buildUnchecked();
        Assertions.assertThat(myQuoteChangeMyQuoteStateAction).isInstanceOf(MyQuoteChangeMyQuoteStateAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { MyQuoteChangeMyQuoteStateAction.builder()
                .quoteState(com.commercetools.api.models.me.MyQuoteState.findEnum("Declined")) } };
    }

    @Test
    public void quoteState() {
        MyQuoteChangeMyQuoteStateAction value = MyQuoteChangeMyQuoteStateAction.of();
        value.setQuoteState(com.commercetools.api.models.me.MyQuoteState.findEnum("Declined"));
        Assertions.assertThat(value.getQuoteState())
                .isEqualTo(com.commercetools.api.models.me.MyQuoteState.findEnum("Declined"));
    }
}
