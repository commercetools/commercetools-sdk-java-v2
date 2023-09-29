
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
public class ApproverHierarchyDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ApproverHierarchyDraftBuilder builder) {
        ApproverHierarchyDraft approverHierarchyDraft = builder.buildUnchecked();
        Assertions.assertThat(approverHierarchyDraft).isInstanceOf(ApproverHierarchyDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ApproverHierarchyDraft.builder()
                .tiers(Collections.singletonList(
                    new com.commercetools.api.models.approval_rule.ApproverConjunctionDraftImpl())) } };
    }

    @Test
    public void tiers() {
        ApproverHierarchyDraft value = ApproverHierarchyDraft.of();
        value.setTiers(
            Collections.singletonList(new com.commercetools.api.models.approval_rule.ApproverConjunctionDraftImpl()));
        Assertions.assertThat(value.getTiers())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.approval_rule.ApproverConjunctionDraftImpl()));
    }
}
