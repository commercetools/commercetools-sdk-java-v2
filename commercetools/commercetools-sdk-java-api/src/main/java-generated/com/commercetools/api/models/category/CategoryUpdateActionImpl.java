
package com.commercetools.api.models.category;

import java.time.*;
import java.util.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.category.CategoryAddAssetAction;
import com.commercetools.api.models.category.CategoryChangeAssetNameAction;
import com.commercetools.api.models.category.CategoryChangeAssetOrderAction;
import com.commercetools.api.models.category.CategoryChangeNameAction;
import com.commercetools.api.models.category.CategoryChangeOrderHintAction;
import com.commercetools.api.models.category.CategoryChangeParentAction;
import com.commercetools.api.models.category.CategoryChangeSlugAction;
import com.commercetools.api.models.category.CategoryRemoveAssetAction;
import com.commercetools.api.models.category.CategorySetAssetCustomFieldAction;
import com.commercetools.api.models.category.CategorySetAssetCustomTypeAction;
import com.commercetools.api.models.category.CategorySetAssetDescriptionAction;
import com.commercetools.api.models.category.CategorySetAssetKeyAction;
import com.commercetools.api.models.category.CategorySetAssetSourcesAction;
import com.commercetools.api.models.category.CategorySetAssetTagsAction;
import com.commercetools.api.models.category.CategorySetCustomFieldAction;
import com.commercetools.api.models.category.CategorySetCustomTypeAction;
import com.commercetools.api.models.category.CategorySetDescriptionAction;
import com.commercetools.api.models.category.CategorySetExternalIdAction;
import com.commercetools.api.models.category.CategorySetKeyAction;
import com.commercetools.api.models.category.CategorySetMetaDescriptionAction;
import com.commercetools.api.models.category.CategorySetMetaKeywordsAction;
import com.commercetools.api.models.category.CategorySetMetaTitleAction;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CategoryUpdateActionImpl implements CategoryUpdateAction {

    private String action;

    @JsonCreator
    CategoryUpdateActionImpl(@JsonProperty("action") final String action) {
        this.action = action;
    }

    public CategoryUpdateActionImpl() {
    }

    public String getAction() {
        return this.action;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CategoryUpdateActionImpl that = (CategoryUpdateActionImpl) o;

        return new EqualsBuilder().append(action, that.action).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).toHashCode();
    }

}
