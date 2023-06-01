package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.common.Image;
import com.commercetools.history.models.change.MoveImageToPositionChange;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MoveImageToPositionChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MoveImageToPositionChange moveImageToPositionChange = MoveImageToPositionChange.builder()
 *             .change("{change}")
 *             .catalogData("{catalogData}")
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class MoveImageToPositionChangeBuilder implements Builder<MoveImageToPositionChange> {

    
    
    private String change;
    
    
    
    private String catalogData;
    
    
    
    private java.util.List<com.commercetools.history.models.common.Image> previousValue;
    
    
    
    private java.util.List<com.commercetools.history.models.common.Image> nextValue;

    
    /**
     *  <p>Update actions for moving images</p>
     * @param change value to be set
     * @return Builder
     */
    
    public MoveImageToPositionChangeBuilder change( final String change) {
        this.change = change;
        return this;
    }
    
    
    
    
    /**
     * set the value to the catalogData
     * @param catalogData value to be set
     * @return Builder
     */
    
    public MoveImageToPositionChangeBuilder catalogData( final String catalogData) {
        this.catalogData = catalogData;
        return this;
    }
    
    
    
    /**
     * set values to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */
    
    public MoveImageToPositionChangeBuilder previousValue( final com.commercetools.history.models.common.Image ...previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }
    
    /**
     * set value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */
    
    public MoveImageToPositionChangeBuilder previousValue( final java.util.List<com.commercetools.history.models.common.Image> previousValue) {
        this.previousValue = previousValue;
        return this;
    }
    
    /**
     * add values to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */
    
    public MoveImageToPositionChangeBuilder plusPreviousValue( final com.commercetools.history.models.common.Image ...previousValue) {
        if (this.previousValue == null) {
            this.previousValue = new ArrayList<>();
        }
        this.previousValue.addAll(Arrays.asList(previousValue));
        return this;
    }
    
    
    
    /**
     * add the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */
    
    public MoveImageToPositionChangeBuilder plusPreviousValue(Function<com.commercetools.history.models.common.ImageBuilder, com.commercetools.history.models.common.ImageBuilder> builder) {
        if (this.previousValue == null) {
            this.previousValue = new ArrayList<>();
        }
        this.previousValue.add(builder.apply(com.commercetools.history.models.common.ImageBuilder.of()).build());
        return this;
    }
    
    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */
    
    public MoveImageToPositionChangeBuilder withPreviousValue(Function<com.commercetools.history.models.common.ImageBuilder, com.commercetools.history.models.common.ImageBuilder> builder) {
        this.previousValue = new ArrayList<>();
        this.previousValue.add(builder.apply(com.commercetools.history.models.common.ImageBuilder.of()).build());
        return this;
    }
    
    /**
     * add the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */
    
    public MoveImageToPositionChangeBuilder addPreviousValue(Function<com.commercetools.history.models.common.ImageBuilder, com.commercetools.history.models.common.Image> builder) {
        return plusPreviousValue(builder.apply(com.commercetools.history.models.common.ImageBuilder.of()));
    }
    
    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */
    
    public MoveImageToPositionChangeBuilder setPreviousValue(Function<com.commercetools.history.models.common.ImageBuilder, com.commercetools.history.models.common.Image> builder) {
        return previousValue(builder.apply(com.commercetools.history.models.common.ImageBuilder.of()));
    }
                    
    
    /**
     * set values to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */
    
    public MoveImageToPositionChangeBuilder nextValue( final com.commercetools.history.models.common.Image ...nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }
    
    /**
     * set value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */
    
    public MoveImageToPositionChangeBuilder nextValue( final java.util.List<com.commercetools.history.models.common.Image> nextValue) {
        this.nextValue = nextValue;
        return this;
    }
    
    /**
     * add values to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */
    
    public MoveImageToPositionChangeBuilder plusNextValue( final com.commercetools.history.models.common.Image ...nextValue) {
        if (this.nextValue == null) {
            this.nextValue = new ArrayList<>();
        }
        this.nextValue.addAll(Arrays.asList(nextValue));
        return this;
    }
    
    
    
    /**
     * add the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */
    
    public MoveImageToPositionChangeBuilder plusNextValue(Function<com.commercetools.history.models.common.ImageBuilder, com.commercetools.history.models.common.ImageBuilder> builder) {
        if (this.nextValue == null) {
            this.nextValue = new ArrayList<>();
        }
        this.nextValue.add(builder.apply(com.commercetools.history.models.common.ImageBuilder.of()).build());
        return this;
    }
    
    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */
    
    public MoveImageToPositionChangeBuilder withNextValue(Function<com.commercetools.history.models.common.ImageBuilder, com.commercetools.history.models.common.ImageBuilder> builder) {
        this.nextValue = new ArrayList<>();
        this.nextValue.add(builder.apply(com.commercetools.history.models.common.ImageBuilder.of()).build());
        return this;
    }
    
    /**
     * add the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */
    
    public MoveImageToPositionChangeBuilder addNextValue(Function<com.commercetools.history.models.common.ImageBuilder, com.commercetools.history.models.common.Image> builder) {
        return plusNextValue(builder.apply(com.commercetools.history.models.common.ImageBuilder.of()));
    }
    
    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */
    
    public MoveImageToPositionChangeBuilder setNextValue(Function<com.commercetools.history.models.common.ImageBuilder, com.commercetools.history.models.common.Image> builder) {
        return nextValue(builder.apply(com.commercetools.history.models.common.ImageBuilder.of()));
    }
                    

    /**
     *  <p>Update actions for moving images</p>
     * @return change
     */
    
    
    public String getChange(){
        return this.change;
    }
    
    /**
     * value of catalogData}
     * @return catalogData
     */
    
    
    public String getCatalogData(){
        return this.catalogData;
    }
    
    /**
     * value of previousValue}
     * @return previousValue
     */
    
    
    public java.util.List<com.commercetools.history.models.common.Image> getPreviousValue(){
        return this.previousValue;
    }
    
    /**
     * value of nextValue}
     * @return nextValue
     */
    
    
    public java.util.List<com.commercetools.history.models.common.Image> getNextValue(){
        return this.nextValue;
    }

    /**
     * builds MoveImageToPositionChange with checking for non-null required values
     * @return MoveImageToPositionChange
     */
    public MoveImageToPositionChange build() {
        Objects.requireNonNull(change, MoveImageToPositionChange.class + ": change is missing");
        Objects.requireNonNull(catalogData, MoveImageToPositionChange.class + ": catalogData is missing");
        Objects.requireNonNull(previousValue, MoveImageToPositionChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, MoveImageToPositionChange.class + ": nextValue is missing");
        return new MoveImageToPositionChangeImpl(change, catalogData, previousValue, nextValue);
    }
    
    /**
     * builds MoveImageToPositionChange without checking for non-null required values
     * @return MoveImageToPositionChange
     */
    public MoveImageToPositionChange buildUnchecked() {
        return new MoveImageToPositionChangeImpl(change, catalogData, previousValue, nextValue);
    }

    /**
     * factory method for an instance of MoveImageToPositionChangeBuilder
     * @return builder 
     */
    public static MoveImageToPositionChangeBuilder of() {
        return new MoveImageToPositionChangeBuilder();
    }

    /**
     * create builder for MoveImageToPositionChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MoveImageToPositionChangeBuilder of(final MoveImageToPositionChange template) {
        MoveImageToPositionChangeBuilder builder = new MoveImageToPositionChangeBuilder();
        builder.change = template.getChange();
        builder.catalogData = template.getCatalogData();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
