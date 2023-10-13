
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
public class RuleApproverTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(RuleApproverBuilder builder) {
        RuleApprover ruleApprover = builder.buildUnchecked();
        Assertions.assertThat(ruleApprover).isInstanceOf(RuleApprover.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { RuleApprover.builder()
                .associateRole(new com.commercetools.api.models.associate_role.AssociateRoleKeyReferenceImpl()) } };
    }

    @Test
    public void associateRole() {
        RuleApprover value = RuleApprover.of();
        value.setAssociateRole(new com.commercetools.api.models.associate_role.AssociateRoleKeyReferenceImpl());
        Assertions.assertThat(value.getAssociateRole())
                .isEqualTo(new com.commercetools.api.models.associate_role.AssociateRoleKeyReferenceImpl());
    }
}
