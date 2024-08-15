Controller
```java
package com.datorium.Datorium.API.Controllers;
import com.datorium.Datorium.API.DTOs.Cheese;
import com.datorium.Datorium.API.DTOs.UpdateCheeseDTO;
import com.datorium.Datorium.API.Services.CheeseShopService;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RestController
@RequestMapping("/cheese")

public class CheeseShopController {
    private CheeseShopService cheeseShopService;
    public CheeseShopController() {
        cheeseShopService = new CheeseShopService();
    }

    @PostMapping("/add")
    public int add(@RequestBody Cheese cheese){
        return cheeseShopService.add(cheese);
    }

    @GetMapping("/all")
    public ArrayList<Cheese> getCheeses() {
        return cheeseShopService.getCheeses();
    }

    @PostMapping("/update")
    public Cheese update(@RequestBody UpdateCheeseDTO updateCheeseDTO){
        return cheeseShopService.update(updateCheeseDTO.cheeseIndex, updateCheeseDTO.cheese);
    }
}
```
Service
```java
package com.datorium.Datorium.API.Services;
import com.datorium.Datorium.API.DTOs.Cheese;
import com.datorium.Datorium.API.Repo.CheeseShopRepo;
import java.util.ArrayList;

public class CheeseShopService {
    private CheeseShopRepo cheeseShopRepo;
    public CheeseShopService(){
        cheeseShopRepo = new CheeseShopRepo();
    }
    public int add(Cheese cheese){
        return cheeseShopRepo.add(cheese);
    }

    public ArrayList<Cheese> getCheeses() {
        return cheeseShopRepo.getCheeses();
    }

    public Cheese update (int cheeseIndex, Cheese updateCheeseDTO) {
        return cheeseShopRepo.update(cheeseIndex, updateCheeseDTO);
    }
}
```
Repo
```java
package com.datorium.Datorium.API.Repo;
import com.datorium.Datorium.API.DTOs.Cheese;
import java.util.ArrayList;

public class CheeseShopRepo {
    private ArrayList<Cheese> cheeses = new ArrayList<>();

    public int add(Cheese cheese){
        cheeses.add(cheese);
        return cheeses.size();
    }

    public ArrayList<Cheese> getCheeses() {
        return cheeses;
    }

    public Cheese update(int cheeseIndex, Cheese updateCheeseDTO){
        var cheese = cheeses.get(cheeseIndex);
        cheese.name = updateCheeseDTO.name;
        return cheese;
    }
}
```
DTOs
```java
package com.datorium.Datorium.API.DTOs;

public class Cheese {
public String name;
}

public class UpdateCheeseDTO {
    public Cheese cheese;
    public int cheeseIndex;
}

```