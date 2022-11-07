
package com.commercetools.api.models.attribute_group;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * AttributeGroupUpdateActionBuilder
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
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

    public static AttributeGroupUpdateActionBuilder of() {
        return new AttributeGroupUpdateActionBuilder();
    }
}
