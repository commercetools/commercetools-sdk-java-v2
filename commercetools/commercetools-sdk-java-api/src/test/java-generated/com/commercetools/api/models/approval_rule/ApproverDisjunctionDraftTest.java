
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
public class ApproverDisjunctionDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ApproverDisjunctionDraftBuilder builder) {
        ApproverDisjunctionDraft approverDisjunctionDraft = builder.buildUnchecked();
        Assertions.assertThat(approverDisjunctionDraft).isInstanceOf(ApproverDisjunctionDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ApproverDisjunctionDraft.builder()
                .or(Collections
                        .singletonList(new com.commercetools.api.models.approval_rule.RuleApproverDraftImpl())) } };
    }

    @Test
    public void or() {
        ApproverDisjunctionDraft value = ApproverDisjunctionDraft.of();
        value.setOr(Collections.singletonList(new com.commercetools.api.models.approval_rule.RuleApproverDraftImpl()));
        Assertions.assertThat(value.getOr())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.approval_rule.RuleApproverDraftImpl()));
    }
}
