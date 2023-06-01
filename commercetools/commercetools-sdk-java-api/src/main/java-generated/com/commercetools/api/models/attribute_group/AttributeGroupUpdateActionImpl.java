package com.commercetools.api.models.attribute_group;

import com.commercetools.api.models.attribute_group.AttributeGroupAddAttributeAction;
import com.commercetools.api.models.attribute_group.AttributeGroupChangeNameAction;
import com.commercetools.api.models.attribute_group.AttributeGroupRemoveAttributeAction;
import com.commercetools.api.models.attribute_group.AttributeGroupSetAttributesAction;
import com.commercetools.api.models.attribute_group.AttributeGroupSetDescriptionAction;
import com.commercetools.api.models.attribute_group.AttributeGroupSetKeyAction;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.ModelBase;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * AttributeGroupUpdateAction
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class AttributeGroupUpdateActionImpl implements AttributeGroupUpdateAction, ModelBase {

    
    private String action;

    /**
     * create instance with all properties
     */
    @JsonCreator
    AttributeGroupUpdateActionImpl(@JsonProperty("action") final String action) {
        this.action = action;
    }
    /**
     * create empty instance
     */
    public AttributeGroupUpdateActionImpl() {
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        AttributeGroupUpdateActionImpl that = (AttributeGroupUpdateActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .toHashCode();
    }

}
