package com.xenotech.cassandra.model

import org.springframework.data.cassandra.core.mapping.PrimaryKey
import org.springframework.data.cassandra.core.mapping.Table

@Table
class Product {
    @PrimaryKey
    int id
    String name
}
