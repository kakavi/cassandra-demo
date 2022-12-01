package com.xenotech.cassandra.repository

import com.xenotech.cassandra.model.Product
import org.springframework.data.cassandra.repository.CassandraRepository

interface ProductRepository extends CassandraRepository<Product,Integer>{
}
