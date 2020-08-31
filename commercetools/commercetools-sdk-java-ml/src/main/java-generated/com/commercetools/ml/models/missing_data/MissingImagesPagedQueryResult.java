package com.commercetools.ml.models.missing_data;

import com.commercetools.ml.models.missing_data.MissingImages;
import com.commercetools.ml.models.missing_data.MissingImagesMeta;
import com.commercetools.ml.models.missing_data.MissingImagesPagedQueryResultImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = MissingImagesPagedQueryResultImpl.class)
public interface MissingImagesPagedQueryResult  {

    
    @NotNull
    @JsonProperty("count")
    public Long getCount();
    
    @NotNull
    @JsonProperty("total")
    public Long getTotal();
    
    @NotNull
    @JsonProperty("offset")
    public Long getOffset();
    
    @NotNull
    @Valid
    @JsonProperty("results")
    public List<MissingImages> getResults();
    
    @NotNull
    @Valid
    @JsonProperty("meta")
    public MissingImagesMeta getMeta();

    public void setCount(final Long count);
    
    public void setTotal(final Long total);
    
    public void setOffset(final Long offset);
    
    public void setResults(final List<MissingImages> results);
    
    public void setMeta(final MissingImagesMeta meta);

    public static MissingImagesPagedQueryResultImpl of(){
        return new MissingImagesPagedQueryResultImpl();
    }
    

    public static MissingImagesPagedQueryResultImpl of(final MissingImagesPagedQueryResult template) {
        MissingImagesPagedQueryResultImpl instance = new MissingImagesPagedQueryResultImpl();
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setOffset(template.getOffset());
        instance.setResults(template.getResults());
        instance.setMeta(template.getMeta());
        return instance;
    }

}
