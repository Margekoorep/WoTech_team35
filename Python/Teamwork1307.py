dataset = pd.read_csv('/content/transaction_dataset.csv')


#TASK 1: Create a bar chart that shows the count of transactions for each unique value in the 'Gender' column
#(including NaN values)

gender_data= dataset['Gender'].value_counts(dropna = False).reset_index()
gender_data['Gender'].fillna('Unknown', inplace=True)
collumn_names= ['Gender', 'Count']
gender_data.columns =collumn_names

plt.bar(gender_data['Gender'], gender_data['Count'],color='Skyblue', edgecolor='black')
plt.title('Count of customer by gender(including NaN)')
plt.ylabel('Count') 
plt.xlabel('Gender')
plt.grid(True)
plt.show()

________________________________________________________________________________________

#TASK 2: Create a horizontal bar chart that shows the top 5 most frequent names in the DataFrame, 
#based on the 'name' column. 
#(First, create a grouped DataFrame (name_df), then filter it using iloc, and finally create the visualization.) 

name_df= dataset['Name'].value_counts().reset_index()
collumn_names= ['Name', 'Count']
name_df.columns =collumn_names
name_df= name_df.iloc[[0,1,2,3,4],:]

plt.barh(name_df['Name'], name_df['Count'], color = 'cyan',edgecolor='black' )
plt.title('Most popular names')
plt.ylabel('Name') 
plt.xlabel('Count')
plt.grid(True)


_________________________________________________________________________________________

# TASK 3: Create a filtered DataFrame that includes Category == 'Clothing' and Gender == 'M'. 
#How many rows are there in this filtered DataFrame? Format the result as follows: The filtered DataFrame has XXXX rows

filtered_df=dataset[(dataset['Category'] == 'Clothing') & (dataset['Gender'] == 'M')]
filtered_df
 
num_of_rows= filtered_df.shape[0]
print(f'The filtered DataFrame has {num_of_rows} rows')
