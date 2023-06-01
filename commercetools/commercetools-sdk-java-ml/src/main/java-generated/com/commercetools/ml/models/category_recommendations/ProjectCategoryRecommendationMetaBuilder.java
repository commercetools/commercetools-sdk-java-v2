package com.commercetools.ml.models.category_recommendations;


import com.commercetools.ml.models.category_recommendations.ProjectCategoryRecommendationMeta;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProjectCategoryRecommendationMetaBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProjectCategoryRecommendationMeta projectCategoryRecommendationMeta = ProjectCategoryRecommendationMeta.builder()
 *             .plusGeneralCategoryNames(generalCategoryNamesBuilder -> generalCategoryNamesBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProjectCategoryRecommendationMetaBuilder implements Builder<ProjectCategoryRecommendationMeta> {

    
    @Nullable
    private String productName;
    
    
    @Nullable
    private String productImageUrl;
    
    
    
    private java.util.List<String> generalCategoryNames;

    
    /**
     *  <p>The product name that was used to generate recommendations.</p>
     * @param productName value to be set
     * @return Builder
     */
    
    public ProjectCategoryRecommendationMetaBuilder productName(@Nullable final String productName) {
        this.productName = productName;
        return this;
    }
    
    
    
    
    /**
     *  <p>The product image that was used to generate recommendations.</p>
     * @param productImageUrl value to be set
     * @return Builder
     */
    
    public ProjectCategoryRecommendationMetaBuilder productImageUrl(@Nullable final String productImageUrl) {
        this.productImageUrl = productImageUrl;
        return this;
    }
    
    
    
    /**
     *  <p>Top 5 general categories that were used internally to generate the project-specific categories. These category names are not related to the categories defined in the project, but they provide additional information to understand the project-specific categories in the results section.</p>
     * @param generalCategoryNames value to be set
     * @return Builder
     */
    
    public ProjectCategoryRecommendationMetaBuilder generalCategoryNames( final String ...generalCategoryNames) {
        this.generalCategoryNames = new ArrayList<>(Arrays.asList(generalCategoryNames));
        return this;
    }
    
    /**
     *  <p>Top 5 general categories that were used internally to generate the project-specific categories. These category names are not related to the categories defined in the project, but they provide additional information to understand the project-specific categories in the results section.</p>
     * @param generalCategoryNames value to be set
     * @return Builder
     */
    
    public ProjectCategoryRecommendationMetaBuilder generalCategoryNames( final java.util.List<String> generalCategoryNames) {
        this.generalCategoryNames = generalCategoryNames;
        return this;
    }
    
    /**
     *  <p>Top 5 general categories that were used internally to generate the project-specific categories. These category names are not related to the categories defined in the project, but they provide additional information to understand the project-specific categories in the results section.</p>
     * @param generalCategoryNames value to be set
     * @return Builder
     */
    
    public ProjectCategoryRecommendationMetaBuilder plusGeneralCategoryNames( final String ...generalCategoryNames) {
        if (this.generalCategoryNames == null) {
            this.generalCategoryNames = new ArrayList<>();
        }
        this.generalCategoryNames.addAll(Arrays.asList(generalCategoryNames));
        return this;
    }
    
    
    

    /**
     *  <p>The product name that was used to generate recommendations.</p>
     * @return productName
     */
    
    @Nullable
    public String getProductName(){
        return this.productName;
    }
    
    /**
     *  <p>The product image that was used to generate recommendations.</p>
     * @return productImageUrl
     */
    
    @Nullable
    public String getProductImageUrl(){
        return this.productImageUrl;
    }
    
    /**
     *  <p>Top 5 general categories that were used internally to generate the project-specific categories. These category names are not related to the categories defined in the project, but they provide additional information to understand the project-specific categories in the results section.</p>
     * @return generalCategoryNames
     */
    
    
    public java.util.List<String> getGeneralCategoryNames(){
        return this.generalCategoryNames;
    }

    /**
     * builds ProjectCategoryRecommendationMeta with checking for non-null required values
     * @return ProjectCategoryRecommendationMeta
     */
    public ProjectCategoryRecommendationMeta build() {
        Objects.requireNonNull(generalCategoryNames, ProjectCategoryRecommendationMeta.class + ": generalCategoryNames is missing");
        return new ProjectCategoryRecommendationMetaImpl(productName, productImageUrl, generalCategoryNames);
    }
    
    /**
     * builds ProjectCategoryRecommendationMeta without checking for non-null required values
     * @return ProjectCategoryRecommendationMeta
     */
    public ProjectCategoryRecommendationMeta buildUnchecked() {
        return new ProjectCategoryRecommendationMetaImpl(productName, productImageUrl, generalCategoryNames);
    }

    /**
     * factory method for an instance of ProjectCategoryRecommendationMetaBuilder
     * @return builder 
     */
    public static ProjectCategoryRecommendationMetaBuilder of() {
        return new ProjectCategoryRecommendationMetaBuilder();
    }

    /**
     * create builder for ProjectCategoryRecommendationMeta instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProjectCategoryRecommendationMetaBuilder of(final ProjectCategoryRecommendationMeta template) {
        ProjectCategoryRecommendationMetaBuilder builder = new ProjectCategoryRecommendationMetaBuilder();
        builder.productName = template.getProductName();
        builder.productImageUrl = template.getProductImageUrl();
        builder.generalCategoryNames = template.getGeneralCategoryNames();
        return builder;
    }

}
