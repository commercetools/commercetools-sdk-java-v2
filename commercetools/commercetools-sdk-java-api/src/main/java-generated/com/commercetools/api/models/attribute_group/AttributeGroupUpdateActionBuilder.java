package com.commercetools.api.models.attribute_group;

import com.commercetools.api.models.attribute_group.AttributeGroupAddAttributeAction;
import com.commercetools.api.models.attribute_group.AttributeGroupChangeNameAction;
import com.commercetools.api.models.attribute_group.AttributeGroupRemoveAttributeAction;
import com.commercetools.api.models.attribute_group.AttributeGroupSetAttributesAction;
import com.commercetools.api.models.attribute_group.AttributeGroupSetDescriptionAction;
import com.commercetools.api.models.attribute_group.AttributeGroupSetKeyAction;
import com.commercetools.api.models.attribute_group.AttributeGroupUpdateAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AttributeGroupUpdateActionBuilder
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class AttributeGroupUpdateActionBuilder {

    public com.commercetools.api.models.attribute_group.AttributeGroupAddAttributeActionBuilder addAttributeBuilder() {
       return com.commercetools.api.models.attribute_group.AttributeGroupAddAttributeActionBuilder.of();
    }
    public com.commercetools.api.models.attribute_group.AttributeGroupChangeNameActionBuilder changeNameBuilder() {
       return com.commercetools.api.models.attribute_group.AttributeGroupChangeNameActionBuilder.of();
    }
    public com.commercetools.api.models.attribute_group.AttributeGroupRemoveAttributeActionBuilder removeAttributeBuilder() {
       return com.commercetools.api.models.attribute_group.AttributeGroupRemoveAttributeActionBuilder.of();
    }
    public com.commercetools.api.models.attribute_group.AttributeGroupSetAttributesActionBuilder setAttributesBuilder() {
       return com.commercetools.api.models.attribute_group.AttributeGroupSetAttributesActionBuilder.of();
    }
    public com.commercetools.api.models.attribute_group.AttributeGroupSetDescriptionActionBuilder setDescriptionBuilder() {
       return com.commercetools.api.models.attribute_group.AttributeGroupSetDescriptionActionBuilder.of();
    }
    public com.commercetools.api.models.attribute_group.AttributeGroupSetKeyActionBuilder setKeyBuilder() {
       return com.commercetools.api.models.attribute_group.AttributeGroupSetKeyActionBuilder.of();
    }

    /**
     * factory method for an instance of AttributeGroupUpdateActionBuilder
     * @return builder 
     */
    public static AttributeGroupUpdateActionBuilder of() {
        return new AttributeGroupUpdateActionBuilder();
    }

}
