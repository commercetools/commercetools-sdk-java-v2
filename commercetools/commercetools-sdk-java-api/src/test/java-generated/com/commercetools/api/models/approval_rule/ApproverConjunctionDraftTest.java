
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
public class ApproverConjunctionDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ApproverConjunctionDraftBuilder builder) {
        ApproverConjunctionDraft approverConjunctionDraft = builder.buildUnchecked();
        Assertions.assertThat(approverConjunctionDraft).isInstanceOf(ApproverConjunctionDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ApproverConjunctionDraft.builder()
                .and(Collections.singletonList(
                    new com.commercetools.api.models.approval_rule.ApproverDisjunctionDraftImpl())) } };
    }

    @Test
    public void and() {
        ApproverConjunctionDraft value = ApproverConjunctionDraft.of();
        value.setAnd(
            Collections.singletonList(new com.commercetools.api.models.approval_rule.ApproverDisjunctionDraftImpl()));
        Assertions.assertThat(value.getAnd())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.approval_rule.ApproverDisjunctionDraftImpl()));
    }
}
