// Colour mixer for postmans post request: 
@PostMapping("/mixColour")
	public Colour getColour(@RequestBody PrimaryColours primaryColours){
		if ((primaryColours.colour1.equals("yellow") && primaryColours.colour2.equals("red")) || (primaryColours.colour1.equals("red") && primaryColours.colour2.equals("yellow"))){
			var colour = new Colour();
			colour.name = "orange";
			return colour;
		}else if ( (primaryColours.colour1.equals("yellow") && primaryColours.colour2.equals("blue")) || (primaryColours.colour1.equals("blue") && primaryColours.colour2.equals("yellow"))){
			var colour = new Colour();
			colour.name = "green";
			return colour;
		}else if ( (primaryColours.colour1.equals("red") && primaryColours.colour2.equals("blue")) || (primaryColours.colour1.equals("blue") && primaryColours.colour2.equals("red"))){
			var colour = new Colour();
			colour.name = "purple";
			return colour;
		}
		return null;
	}
