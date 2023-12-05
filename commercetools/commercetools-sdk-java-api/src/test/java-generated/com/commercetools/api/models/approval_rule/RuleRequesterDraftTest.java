
package com.commercetools.api.models.approval_rule;

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
public class RuleRequesterDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(RuleRequesterDraftBuilder builder) {
        RuleRequesterDraft ruleRequesterDraft = builder.buildUnchecked();
        Assertions.assertThat(ruleRequesterDraft).isInstanceOf(RuleRequesterDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { RuleRequesterDraft.builder()
                .associateRole(
                    new com.commercetools.api.models.associate_role.AssociateRoleResourceIdentifierImpl()) } };
    }

    @Test
    public void associateRole() {
        RuleRequesterDraft value = RuleRequesterDraft.of();
        value.setAssociateRole(new com.commercetools.api.models.associate_role.AssociateRoleResourceIdentifierImpl());
        Assertions.assertThat(value.getAssociateRole())
                .isEqualTo(new com.commercetools.api.models.associate_role.AssociateRoleResourceIdentifierImpl());
    }
}
