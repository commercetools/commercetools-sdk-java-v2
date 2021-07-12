
package com.commercetools.importapi.models.importrequests;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.categories.CategoryImport;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>The request body to <a href="#import-categories">import Categories</a>. Contains data for <a href="/../api/projects/categories#category">Categories</a> to be created or updated in a commercetools Project.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CategoryImportRequestImpl.class)
public interface CategoryImportRequest extends ImportRequest {

    String CATEGORY = "category";

    /**
    *  <p>The category import resources of this request.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("resources")
    public List<CategoryImport> getResources();

    @JsonIgnore
    public void setResources(final CategoryImport... resources);

    public void setResources(final List<CategoryImport> resources);

    public static CategoryImportRequest of() {
        return new CategoryImportRequestImpl();
    }

    public static CategoryImportRequest of(final CategoryImportRequest template) {
        CategoryImportRequestImpl instance = new CategoryImportRequestImpl();
        instance.setResources(template.getResources());
        return instance;
    }

    public static CategoryImportRequestBuilder builder() {
        return CategoryImportRequestBuilder.of();
    }

    public static CategoryImportRequestBuilder builder(final CategoryImportRequest template) {
        return CategoryImportRequestBuilder.of(template);
    }

    default <T> T withCategoryImportRequest(Function<CategoryImportRequest, T> helper) {
        return helper.apply(this);
    }
}
