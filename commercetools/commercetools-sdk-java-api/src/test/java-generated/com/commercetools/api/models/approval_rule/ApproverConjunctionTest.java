
package com.commercetools.api.models.approval_rule;

import java.util.Collections;

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
public class ApproverConjunctionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ApproverConjunctionBuilder builder) {
        ApproverConjunction approverConjunction = builder.buildUnchecked();
        Assertions.assertThat(approverConjunction).isInstanceOf(ApproverConjunction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ApproverConjunction.builder()
                .and(Collections
                        .singletonList(new com.commercetools.api.models.approval_rule.ApproverDisjunctionImpl())) } };
    }

    @Test
    public void and() {
        ApproverConjunction value = ApproverConjunction.of();
        value.setAnd(
            Collections.singletonList(new com.commercetools.api.models.approval_rule.ApproverDisjunctionImpl()));
        Assertions.assertThat(value.getAnd())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.approval_rule.ApproverDisjunctionImpl()));
    }
}
