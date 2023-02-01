
package com.commercetools.api.client;

import java.util.List;
import java.util.function.UnaryOperator;

import com.commercetools.api.models.Versioned;
import com.commercetools.api.models.attribute_group.AttributeGroup;
import com.commercetools.api.models.attribute_group.AttributeGroupDraft;
import com.commercetools.api.models.attribute_group.AttributeGroupDraftBuilder;
import com.commercetools.api.models.attribute_group.AttributeGroupUpdate;
import com.commercetools.api.models.attribute_group.AttributeGroupUpdateAction;
import com.commercetools.api.models.attribute_group.AttributeGroupUpdateActionBuilder;

public interface ByProjectKeyAttributeGroupsRequestBuilderMixin {
    public ByProjectKeyAttributeGroupsPost post(AttributeGroupDraft attributeGroupDraft);

    public ByProjectKeyAttributeGroupsByIDRequestBuilder withId(String ID);

    public default ByProjectKeyAttributeGroupsByIDPost update(Versioned<AttributeGroup> attributeGroup,
            List<AttributeGroupUpdateAction> actions) {
        return withId(attributeGroup.getId())
                .post(builder -> AttributeGroupUpdate.builder().version(attributeGroup.getVersion()).actions(actions));
    }

    public default ByProjectKeyAttributeGroupsByIDPost update(Versioned<AttributeGroup> attributeGroup,
            UnaryOperator<UpdateActionBuilder<AttributeGroupUpdateAction, AttributeGroupUpdateActionBuilder>> op) {
        return withId(attributeGroup.getId()).post(builder -> AttributeGroupUpdate.builder()
                .version(attributeGroup.getVersion())
                .actions(op.apply(UpdateActionBuilder.of(AttributeGroupUpdateActionBuilder::of)).actions));
    }

    public default WithUpdateActionBuilder<AttributeGroupUpdateAction, AttributeGroupUpdateActionBuilder, ByProjectKeyAttributeGroupsByIDPost> update(
            Versioned<AttributeGroup> attributeGroup) {
        return builder -> withId(attributeGroup.getId()).post(b -> AttributeGroupUpdate.builder()
                .version(attributeGroup.getVersion())
                .actions(builder.apply(UpdateActionBuilder.of(AttributeGroupUpdateActionBuilder::of)).actions));
    }

    public default ByProjectKeyAttributeGroupsByIDDelete delete(Versioned<AttributeGroup> attributeGroup) {
        return withId(attributeGroup.getId()).delete().withVersion(attributeGroup.getVersion());
    }

    public default ByProjectKeyAttributeGroupsPost create(AttributeGroupDraft attributeGroupDraft) {
        return post(attributeGroupDraft);
    }

    public default ByProjectKeyAttributeGroupsPost create(UnaryOperator<AttributeGroupDraftBuilder> op) {
        return post(op.apply(AttributeGroupDraftBuilder.of()).build());
    }

}
