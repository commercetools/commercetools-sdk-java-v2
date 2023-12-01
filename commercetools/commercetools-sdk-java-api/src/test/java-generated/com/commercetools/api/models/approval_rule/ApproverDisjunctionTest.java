
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
public class ApproverDisjunctionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ApproverDisjunctionBuilder builder) {
        ApproverDisjunction approverDisjunction = builder.buildUnchecked();
        Assertions.assertThat(approverDisjunction).isInstanceOf(ApproverDisjunction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ApproverDisjunction.builder()
                .or(Collections.singletonList(new com.commercetools.api.models.approval_rule.RuleApproverImpl())) } };
    }

    @Test
    public void or() {
        ApproverDisjunction value = ApproverDisjunction.of();
        value.setOr(Collections.singletonList(new com.commercetools.api.models.approval_rule.RuleApproverImpl()));
        Assertions.assertThat(value.getOr())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.approval_rule.RuleApproverImpl()));
    }
}
