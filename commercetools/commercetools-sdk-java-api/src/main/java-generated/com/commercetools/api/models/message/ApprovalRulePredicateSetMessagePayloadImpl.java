
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>Generated after a successful Set Predicate update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ApprovalRulePredicateSetMessagePayloadImpl implements ApprovalRulePredicateSetMessagePayload, ModelBase {

    private String type;

    private String predicate;

    private String oldPredicate;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ApprovalRulePredicateSetMessagePayloadImpl(@JsonProperty("predicate") final String predicate,
            @JsonProperty("oldPredicate") final String oldPredicate) {
        this.predicate = predicate;
        this.oldPredicate = oldPredicate;
        this.type = APPROVAL_RULE_PREDICATE_SET;
    }

    /**
     * create empty instance
     */
    public ApprovalRulePredicateSetMessagePayloadImpl() {
        this.type = APPROVAL_RULE_PREDICATE_SET;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Name of the ApprovalRule after the Set Predicate update action.</p>
     */

    public String getPredicate() {
        return this.predicate;
    }

    /**
     *  <p>Name of the ApprovalRule before the Set Predicate update action.</p>
     */

    public String getOldPredicate() {
        return this.oldPredicate;
    }

    public void setPredicate(final String predicate) {
        this.predicate = predicate;
    }

    public void setOldPredicate(final String oldPredicate) {
        this.oldPredicate = oldPredicate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ApprovalRulePredicateSetMessagePayloadImpl that = (ApprovalRulePredicateSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(predicate, that.predicate)
                .append(oldPredicate, that.oldPredicate)
                .append(type, that.type)
                .append(predicate, that.predicate)
                .append(oldPredicate, that.oldPredicate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(predicate).append(oldPredicate).toHashCode();
    }

}
