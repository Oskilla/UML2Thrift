service Cache {
		returnType storeARecord( 1:host HostName, 2:address IPAddress, 3:ttl TimeToLive,)
}

struct IPAddress {
		1:Integer values
		}
struct HostName {
		1:String names
		}
struct TimeToLive {
		1:Real value
		}

