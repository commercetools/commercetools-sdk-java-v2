
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
public class ApproverHierarchyTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ApproverHierarchyBuilder builder) {
        ApproverHierarchy approverHierarchy = builder.buildUnchecked();
        Assertions.assertThat(approverHierarchy).isInstanceOf(ApproverHierarchy.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ApproverHierarchy.builder()
                .tiers(Collections
                        .singletonList(new com.commercetools.api.models.approval_rule.ApproverConjunctionImpl())) } };
    }

    @Test
    public void tiers() {
        ApproverHierarchy value = ApproverHierarchy.of();
        value.setTiers(
            Collections.singletonList(new com.commercetools.api.models.approval_rule.ApproverConjunctionImpl()));
        Assertions.assertThat(value.getTiers())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.approval_rule.ApproverConjunctionImpl()));
    }
}
