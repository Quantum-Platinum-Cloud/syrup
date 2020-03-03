
package com.shopify.syrup.queries

import com.shopify.foundation.syrupsupport.*
import com.google.gson.*
import java.math.BigDecimal
import org.joda.time.DateTime
import com.shopify.syrup.enums.*
import com.shopify.syrup.inputs.*
import com.shopify.syrup.fragments.*
import com.shopify.syrup.responses.*
import javax.annotation.Generated

@Generated("com.shopify.syrup")
class TestQuery11Query(var productId: ID): Query<TestQuery11Response> {

    val rawQueryString = "query TestQuery11(\$productId: ID!) { __typename node(id: \$productId) { __typename __typename ... on Product { __typename id collections(first: 100) { __typename edges { __typename node { __typename id title } } } }... on ProductOption { __typename id } } }"

    override fun decodeResponse(jsonObject: JsonObject): TestQuery11Response {
        return TestQuery11Response(jsonObject)
    }

    override fun getQueryString(): String {
        val gson = OperationGsonBuilder.gson
        var variables = gson.toJson(this)
        if (variables != "{}") {
            variables = setDefinedNulls(variables)
            return "{ \"query\": \"$rawQueryString\", \"variables\": $variables}"
        }
        return "{ \"query\": \"$rawQueryString\" }"
    }

    val operationVariables = mapOf<String, String>(
        "productId" to "$productId"
    )

    override val selections = listOf<Selection>(
Selection(
name = "node",
type = "Node",
cacheKey = "node(id: ${operationVariables["productId"]})",
passedGID = "${operationVariables["productId"]}",
backingGIDReference = null,
typeCondition = "QueryRoot",
shouldSkipBasedOnConditionalDirective = false,
selections = listOf<Selection>(
Selection(
name = "id",
type = "ID",
cacheKey = "id",
passedGID = null,
backingGIDReference = null,
typeCondition = "Product",
shouldSkipBasedOnConditionalDirective = false,
selections = listOf<Selection>()), 
Selection(
name = "collections",
type = "CollectionConnection",
cacheKey = "collections(first: 100)",
passedGID = null,
backingGIDReference = null,
typeCondition = "Product",
shouldSkipBasedOnConditionalDirective = false,
selections = listOf<Selection>(
Selection(
name = "edges",
type = "CollectionEdge",
cacheKey = "edges",
passedGID = null,
backingGIDReference = null,
typeCondition = "CollectionConnection",
shouldSkipBasedOnConditionalDirective = false,
selections = listOf<Selection>(
Selection(
name = "node",
type = "Collection",
cacheKey = "node",
passedGID = null,
backingGIDReference = "id",
typeCondition = "CollectionEdge",
shouldSkipBasedOnConditionalDirective = false,
selections = listOf<Selection>(
Selection(
name = "id",
type = "ID",
cacheKey = "id",
passedGID = null,
backingGIDReference = null,
typeCondition = "Collection",
shouldSkipBasedOnConditionalDirective = false,
selections = listOf<Selection>()), 
Selection(
name = "title",
type = "String",
cacheKey = "title",
passedGID = null,
backingGIDReference = null,
typeCondition = "Collection",
shouldSkipBasedOnConditionalDirective = false,
selections = listOf<Selection>()))))))), 
Selection(
name = "id",
type = "ID",
cacheKey = "id",
passedGID = null,
backingGIDReference = null,
typeCondition = "ProductOption",
shouldSkipBasedOnConditionalDirective = false,
selections = listOf<Selection>()))))
}
